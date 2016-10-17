package com.rongxianren.patterdesign.BuilderPattern.model;

/**
 * Created by wty on 16/5/17.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("benz炫酷的启动了---------");
    }

    @Override
    protected void stop() {
        System.out.println("benz炫酷的启动了---------");
    }

    @Override
    protected void alarm() {
        System.out.println("benz炫酷的启动了---------");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz炫酷的启动了---------");
    }
}
