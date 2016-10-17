package com.rongxianren.patterdesign.StatePattern;

/**
 * Created by wty on 16/9/13.
 */
public class ClosingState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.openningState);
        super.context.getLifeState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭.......");
    }

    @Override
    public void run() {
        super.context.setLifeState(Context.runningState);
        super.context.getLifeState().run();
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.stoppingState);
        super.context.stop();
    }
}
