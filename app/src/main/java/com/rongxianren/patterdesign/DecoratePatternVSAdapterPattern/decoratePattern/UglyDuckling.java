package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.decoratePattern;

/**
 * Created by wty on 16/9/18.
 */
public class UglyDuckling implements Swan {

    @Override
    public void fly() {
        System.out.println("丑小鸭还小  还不会飞");
    }

    @Override
    public void cry() {
        System.out.println("叫声的克鲁.....克鲁.....的叫");
    }

    @Override
    public void desappaerance() {
        System.out.println("跟其他的 小鸭子 长得不一样.......");
    }
}
