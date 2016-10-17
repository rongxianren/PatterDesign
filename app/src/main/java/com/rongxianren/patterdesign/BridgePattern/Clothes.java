package com.rongxianren.patterdesign.BridgePattern;

/**
 * Created by wty on 16/9/14.
 */
public class Clothes extends Product {
    @Override
    public void beProduct() {
        System.out.println("-------山寨产品不好做啊,还是来做服装吧--------");
    }

    @Override
    public void beSell() {
        System.out.println("-------服装虽然不好做 但是也能挣点小钱啊---------");
    }
}
