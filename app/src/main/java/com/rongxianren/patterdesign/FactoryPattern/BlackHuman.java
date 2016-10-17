package com.rongxianren.patterdesign.FactoryPattern;

/**
 * Created by wty on 16/5/18.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("黑种人喜欢说英语");
    }
}
