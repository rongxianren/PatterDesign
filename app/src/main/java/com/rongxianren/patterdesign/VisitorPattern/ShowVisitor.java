package com.rongxianren.patterdesign.VisitorPattern;

/**
 * Created by wty on 16/9/12.
 */
public class ShowVisitor implements IShowVisitor {

    String mEmployeeInfo = "";

    @Override
    public void report() {
        System.out.println(mEmployeeInfo);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        if (null != commonEmployee) {
            mEmployeeInfo = mEmployeeInfo + this.getCommonInfo(commonEmployee) + "\n";
        }
    }

    @Override
    public void visit(Manager manager) {
        if (null != manager) {
            mEmployeeInfo = mEmployeeInfo + this.getManagerInfo(manager) + "\n";
        }
    }

    /**
     * 获取员工的基本信息
     *
     * @param employee
     * @return
     */
    private String getBasicInfo(Employee employee) {
        String info = "姓名: " + employee.getName() + "\t";
        info = info + "性别: " + ((employee.getSex() == employee.FEMALE) ? "女" : "男") + "\t";
        info = info + "薪水: " + employee.getSalary() + "\t";
        return info;
    }

    /**
     * 获取经理人员的信息
     *
     * @param manager
     * @return
     */
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩: " + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    /**
     * 获取普通员工的信息
     *
     * @param commonEmployee
     * @return
     */
    private String getCommonInfo(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作: " + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
