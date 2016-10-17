package com.rongxianren.patterdesign.FactoryPattern;

/**
 * Created by wty on 16/5/18.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人也喜欢说英语");
    }
}
