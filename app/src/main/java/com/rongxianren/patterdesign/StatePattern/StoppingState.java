package com.rongxianren.patterdesign.StatePattern;

/**
 * Created by wty on 16/9/13.
 */
public class StoppingState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.openningState);
        super.context.open();
    }

    @Override
    public void close() {
        /////do nothing
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行.......");
    }
}
