package com.rongxianren.patterdesign.VisitorPattern;

/**
 * Created by wty on 16/9/12.
 */
public class Visitor implements IVisitor {
    
    @Override
    public void visit(CommonEmployee commonEmployee) {
//        System.out.println(this.getCommonInfo(commonEmployee));
//        calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
//        System.out.println(this.getManagerInfo(manager));
//        calManagerSalary(manager.getSalary());
    }


}
