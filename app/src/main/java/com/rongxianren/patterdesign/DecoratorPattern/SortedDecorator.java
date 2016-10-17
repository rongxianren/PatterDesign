package com.rongxianren.patterdesign.DecoratorPattern;

/**
 * Created by wty on 16/9/7.
 */
public class SortedDecorator extends Decorator {
    public SortedDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort() {
        System.out.println("-------全班排名30--------");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
