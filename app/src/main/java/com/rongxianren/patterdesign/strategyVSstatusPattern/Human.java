package com.rongxianren.patterdesign.strategyVSstatusPattern;

/**
 * Created by wty on 16/10/14.
 */

public class Human {
    public static final HumanState CHILD_STATE = new ChildState();
    public static final HumanState ADULT_STATE = new AdultState();
    public static final HumanState OLD_STATE = new OldState();

    private HumanState humanState;
    public void setState(HumanState state) {
        this.humanState = state;
        this.humanState.setHuman(this);
    }

    public void work() {
        this.humanState.work();
    }
}
