package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.factory.factory;

/**
 * Created by wty on 16/9/14.
 */
public class ChildSuperMan implements ISuperMan {
    @Override
    public void specialTalent() {
        System.out.println("-------我是未成年超人------");
    }
}
