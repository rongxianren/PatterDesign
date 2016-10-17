package com.rongxianren.patterdesign.FactoryPattern;

/**
 * Created by wty on 16/5/18.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人喜欢说汉语");
    }
}
