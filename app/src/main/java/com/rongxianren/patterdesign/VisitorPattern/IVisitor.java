package com.rongxianren.patterdesign.VisitorPattern;

/**
 * Created by wty on 16/9/12.
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

//    int getTotalSalary();
}
