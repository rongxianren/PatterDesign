package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.carBuilder;

/**
 * Created by wty on 16/9/18.
 */
public class BenzBuilder extends CarBuilder {
    @Override
    public String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    public String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
