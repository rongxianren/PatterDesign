package com.rongxianren.patterdesign.VisitorPattern;

/**
 * Created by wty on 16/9/12.
 */
public class TotalVisitor implements ITotalVisitor {

    /**
     * 部门经理的工资系数是5
     */
    private final static int MANAGER_COEFFICIENT = 5;

    /**
     * 员工的工资系数是2
     */
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    /**
     * 普通员工的工资总和
     */
    private int commonTotalSalary = 0;

    /**
     * 部门经理的工资总和
     */
    private int managerTotalSalary = 0;


    @Override
    public int totalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        if (null != commonEmployee) {
            this.calCommonSalary(commonEmployee.getSalary());
        }
    }

    @Override
    public void visit(Manager manager) {
        if (null != manager) {
            this.calManagerSalary(manager.getSalary());
        }
    }


    /**
     * 计算经理人员的信息
     *
     * @param salary
     */
    private void calManagerSalary(int salary) {
        this.managerTotalSalary = managerTotalSalary + salary * MANAGER_COEFFICIENT;
    }

    /**
     * 计算普通员工的信息
     *
     * @param salary
     */
    private void calCommonSalary(int salary) {
        this.commonTotalSalary = commonTotalSalary + salary * COMMONEMPLOYEE_COEFFICIENT;
    }
}