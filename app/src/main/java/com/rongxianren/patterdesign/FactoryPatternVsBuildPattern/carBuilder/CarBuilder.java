package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.carBuilder;

/**
 * Created by wty on 16/9/18.
 */
public abstract class CarBuilder {

    private Blueprint blueprint = null;
    private ICar car = null;

    public ICar buildCar() {
        return new Car(buildEngine(), buildWheel());
    }

    public void receiveBlueprint(Blueprint bp) {
        this.blueprint = bp;
    }

    public Blueprint getBlueprint() {
        return blueprint;
    }

    public abstract String buildWheel();

    public abstract String buildEngine();
}
