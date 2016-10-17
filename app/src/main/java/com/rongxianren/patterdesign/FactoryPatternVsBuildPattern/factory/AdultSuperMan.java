package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.factory.factory;

/**
 * Created by wty on 16/9/14.
 */
public class AdultSuperMan implements ISuperMan {
    @Override
    public void specialTalent() {
        System.out.println("-------我是成年超人--------");
    }
}
