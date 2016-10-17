package com.rongxianren.patterdesign.DecoratorPattern;

/**
 * Created by wty on 16/9/7.
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortedDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}
