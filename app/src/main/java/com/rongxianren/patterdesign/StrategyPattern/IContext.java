package com.rongxianren.patterdesign.StrategyPattern;

/**
 * Created by wty on 16/9/7.
 */
public class IContext {
    private IStrategy strategy;

    public IContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operator() {
        if (null != strategy) {
            strategy.operate();
        }
    }
}
