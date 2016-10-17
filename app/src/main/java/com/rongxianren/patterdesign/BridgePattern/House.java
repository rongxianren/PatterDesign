package com.rongxianren.patterdesign.BridgePattern;

/**
 * Created by wty on 16/9/14.
 */
public class House extends Product {
    @Override
    public void beProduct() {
        System.out.println("-------我们是搞房地产的-------");
    }

    @Override
    public void beSell() {
        System.out.println("---------搞房地产 挣翻了 成暴发户了----------");
    }
}
