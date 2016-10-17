package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.build;

/**
 * Created by wty on 16/9/14.
 */
public class Director {
    private static Builder adultBuilder = new AdultSuperManBuilder();
    private static Builder childBuilder = new ChildSuperManBuilder();

    public static SuperMan getAdultSuperMan() {
        return adultBuilder.getSuperMan();
    }

    public static SuperMan getChildSuperMan() {
        return childBuilder.getSuperMan();
    }
}
