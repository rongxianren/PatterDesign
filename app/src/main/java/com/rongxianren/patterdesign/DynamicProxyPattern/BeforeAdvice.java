package com.rongxianren.patterdesign.DynamicProxyPattern;

/**
 * Created by wty on 16/6/10.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void execu() {
        System.out.println("--------我是   前置  通知---------");
    }
}
