package com.rongxianren.patterdesign.DecoratorPattern;

/**
 * Created by wty on 16/9/7.
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    public void report() {
        this.schoolReport.report();
    }

    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
