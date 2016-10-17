package com.rongxianren.patterdesign.StrategyPattern;

/**
 * Created by wty on 16/9/7.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("-------叫孙夫人断后------");
    }
}
