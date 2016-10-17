package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.carBuilder;

/**
 * Created by wty on 16/9/18.
 */
public class Car implements ICar {

    private String engine;
    private String wheel;

    public Car(String engine, String wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }


    @Override
    public String getWheel() {
        return wheel;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    public String toString() {
        return "车子轮子是: " + wheel + " \n车的引擎是: " + engine;
    }
}
