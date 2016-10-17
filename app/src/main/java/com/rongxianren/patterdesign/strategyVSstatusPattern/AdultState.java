package com.rongxianren.patterdesign.strategyVSstatusPattern;

/**
 * Created by wty on 16/10/14.
 */

public class AdultState extends HumanState {
    @Override
    protected void work() {
        System.out.println("-----成年后的工作就是 养家糊口-------");
        super.human.setState(Human.OLD_STATE);
    }
}
