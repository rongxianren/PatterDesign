package com.rongxianren.patterdesign.strategyVSstatusPattern;

/**
 * Created by wty on 16/10/14.
 */

public class OldState extends HumanState {

    @Override
    protected void work() {
        System.out.println("------老年人的工作就是享受天伦之乐-------");
    }
}
