package com.rongxianren.patterdesign.StrategyPattern;

/**
 * Created by wty on 16/9/7.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("------让吴国太开绿灯------");
    }
}
