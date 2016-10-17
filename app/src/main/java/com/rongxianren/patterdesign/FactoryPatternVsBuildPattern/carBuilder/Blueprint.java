package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.carBuilder;

/**
 * Created by wty on 16/9/18.
 */
public class Blueprint {
    private String wheel;
    private String engine;

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
