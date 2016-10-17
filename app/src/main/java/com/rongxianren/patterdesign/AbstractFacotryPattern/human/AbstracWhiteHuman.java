package com.rongxianren.patterdesign.AbstractFacotryPattern.human;

/**
 * Created by wty on 16/5/18.
 */
public abstract class AbstracWhiteHuman implements Human {
    @Override
    public void talk() {
        System.out.println("我会说白话");
    }

    @Override
    public void getColor() {
        System.out.println("我的皮肤是白色的");
    }
}
