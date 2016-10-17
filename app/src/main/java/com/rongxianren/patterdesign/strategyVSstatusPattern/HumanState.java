package com.rongxianren.patterdesign.strategyVSstatusPattern;

/**
 * Created by wty on 16/10/14.
 */

public abstract class HumanState {
    protected Human human;

    public void setHuman( Human human) {
        this.human = human;
    }

    abstract void work();
}
