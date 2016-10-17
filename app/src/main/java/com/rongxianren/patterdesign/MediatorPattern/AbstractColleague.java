package com.rongxianren.patterdesign.MediatorPattern;

/**
 * Created by wty on 16/8/31.
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
