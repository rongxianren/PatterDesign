package com.rongxianren.patterdesign.strategyVSstatusPattern;

/**
 * Created by wty on 16/10/14.
 */

public class ChildState extends HumanState {
    @Override
    protected void work() {
        System.out.println("------童年的工作就是玩耍嬉闹------");
        super.human.setState(Human.ADULT_STATE);
    }
}
