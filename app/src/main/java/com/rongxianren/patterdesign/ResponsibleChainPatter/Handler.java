package com.rongxianren.patterdesign.ResponsibleChainPatter;

/**
 * Created by wty on 16/7/7.
 */
public abstract class Handler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int _level) {
        this.level = _level;
    }

    public final void handleMessage(IWomen women) {
        System.out.println("--------this.getClass()-------- = " + this.getClass().getName());
        if (this.level == women.getType()) {
            this.response(women);
        } else {
            if (null != nextHandler) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("-----没有地方请示了,按不同意处理-----\n");
            }
        }
    }

    public void setNextHandler(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
