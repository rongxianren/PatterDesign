package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.decoratePattern;

/**
 * Created by wty on 16/9/18.
 */
public class StrongBehavior extends Decorator {
    public StrongBehavior(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("丑小鸭 长大了 会飞了.....");
    }
}
