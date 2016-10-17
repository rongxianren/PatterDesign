package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.build;

/**
 * Created by wty on 16/9/14.
 */
public class Client {
    public static void main(String[] args) {
        SuperMan adultSuperMan = Director.getAdultSuperMan();
        System.out.println(adultSuperMan.getSpecialTalent());
    }
}
