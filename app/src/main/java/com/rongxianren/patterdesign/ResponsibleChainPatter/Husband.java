package com.rongxianren.patterdesign.ResponsibleChainPatter;

/**
 * Created by wty on 16/7/7.
 */
public class Husband extends Handler {
    public Husband(int _level) {
        super(_level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-------妻子向丈夫请示--------");
        System.out.println(women.getRequest());
        System.out.println("-------丈夫的答复是:同意--------\n");
    }
}
