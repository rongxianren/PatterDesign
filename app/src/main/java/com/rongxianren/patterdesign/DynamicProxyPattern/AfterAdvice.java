package com.rongxianren.patterdesign.DynamicProxyPattern;

/**
 * Created by wty on 16/6/10.
 */
public class AfterAdvice implements IAdvice {
    @Override
    public void execu() {
        System.out.println("---------我是  后置 通知----------");
    }
}
