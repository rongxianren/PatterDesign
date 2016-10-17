package com.rongxianren.patterdesign.StatePattern;

/**
 * Created by wty on 16/9/13.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLifeState(Context.stoppingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
