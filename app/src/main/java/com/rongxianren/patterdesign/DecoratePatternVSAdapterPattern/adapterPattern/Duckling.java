package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.adapterPattern;

/**
 * Created by wty on 16/9/18.
 */
public class Duckling implements Duck {
    @Override
    public void cry() {
        System.out.println("鸭子 是 嘎....嘎....叫的");
    }

    @Override
    public void desAppearance() {
        System.out.println("鸭子的外貌是 黄白毛相间的.......");
    }

    @Override
    public void desBehavior() {
        System.out.println("鸭子还是会游泳的....");
    }
}
