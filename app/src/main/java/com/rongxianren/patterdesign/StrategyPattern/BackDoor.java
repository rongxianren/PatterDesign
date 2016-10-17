package com.rongxianren.patterdesign.StrategyPattern;

/**
 * Created by wty on 16/9/7.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("------找乔国老开后门------");
    }
}
