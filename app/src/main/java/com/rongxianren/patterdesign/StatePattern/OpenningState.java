package com.rongxianren.patterdesign.StatePattern;

/**
 * Created by wty on 16/9/13.
 */
public class OpenningState extends LifeState {
    @Override
    public void open() {
        System.out.println("电梯门开启.......");
    }

    @Override
    public void close() {
        super.context.setLifeState(Context.closingState);
        super.context.getLifeState().close();
    }

    /**
     * 电梯门开着 你跑什么跑
     */
    @Override
    public void run() {

    }

    /**
     * 开门本来就停下了
     */
    @Override
    public void stop() {

    }
}
