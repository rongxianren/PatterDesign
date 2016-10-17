package com.rongxianren.patterdesign.StatePattern;

/**
 * Created by wty on 16/9/13.
 */
public class RunningState extends LifeState {

    /**
     * 电梯运行中 开什么门  吓不死你
     */
    @Override
    public void open() {
        ////do nothing
    }

    @Override
    public void close() {
        /////do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行中.......");
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.stoppingState);
        super.context.stop();
    }
}
