package com.rongxianren.patterdesign.BuilderPattern.model;

/**
 * Created by wty on 16/5/17.
 */
public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("bwm炫酷的启动了---------");
    }

    @Override
    protected void stop() {
        System.out.println("bwm就应该这样停下来---------");
    }

    @Override
    protected void alarm() {
        System.out.println("bwm的喇叭声音就是大---------");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bwm引擎的声音好清脆---------");
    }
}
