package com.rongxianren.patterdesign.StatePattern;

/**
 * Created by wty on 16/9/13.
 */
public class Context {
    private LifeState lifeState;

    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();


    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
        this.lifeState.setContext(this);
    }

    public void open() {
        this.lifeState.open();
    }

    public void close() {
        this.lifeState.close();
    }

    public void stop() {
        this.lifeState.stop();
    }

    public void run() {
        this.lifeState.run();
    }

}
