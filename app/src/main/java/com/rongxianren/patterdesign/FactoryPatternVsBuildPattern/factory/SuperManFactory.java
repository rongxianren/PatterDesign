package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.factory.factory;

/**
 * Created by wty on 16/9/14.
 */
public class SuperManFactory {
    public static ISuperMan createSuperMan(String type) {
        if (type.equals("adult")) {
            return new AdultSuperMan();
        } else if (type.equals("child")) {
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
