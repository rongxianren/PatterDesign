package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.adapterPattern;

/**
 * Created by wty on 16/9/18.
 */
public class UglyDuckling extends WhiteSwan implements Duck {
    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desAppearance() {
        super.desAppaearance();
    }

    @Override
    public void desBehavior() {
        System.out.print("会游泳  ");
        super.fly();
    }
}
