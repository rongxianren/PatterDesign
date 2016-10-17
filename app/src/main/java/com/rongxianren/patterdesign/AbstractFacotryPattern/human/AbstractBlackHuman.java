package com.rongxianren.patterdesign.AbstractFacotryPattern.human;

/**
 * Created by wty on 16/5/18.
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("我会说黑话");
    }
}
