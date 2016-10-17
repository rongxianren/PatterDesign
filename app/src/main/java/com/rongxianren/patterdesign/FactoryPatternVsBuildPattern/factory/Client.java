package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.factory.factory;

/**
 * Created by wty on 16/9/14.
 */
public class Client {
    public static void main(String[] args) {
        ISuperMan superMan = new SuperManFactory().createSuperMan("adult");
        superMan.specialTalent();
    }
}
