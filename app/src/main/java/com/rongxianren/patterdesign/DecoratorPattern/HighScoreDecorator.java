package com.rongxianren.patterdesign.DecoratorPattern;

/**
 * Created by wty on 16/9/7.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    public void reportHighScore() {
        System.out.println("语文最高分 75 数学最高分73 自然最高分76");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
