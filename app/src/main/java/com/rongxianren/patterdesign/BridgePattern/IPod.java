package com.rongxianren.patterdesign.BridgePattern;

/**
 * Created by wty on 16/9/14.
 */
public class IPod extends Product {
    @Override
    public void beProduct() {
        System.out.println("-----------我们生产的产品是 Ipod-------");
    }

    @Override
    public void beSell() {
        System.out.println("---------Ipod畅销 挣了好多钱-----------");
    }
}
