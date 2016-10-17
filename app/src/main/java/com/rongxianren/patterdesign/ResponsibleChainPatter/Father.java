package com.rongxianren.patterdesign.ResponsibleChainPatter;

/**
 * Created by wty on 16/7/7.
 */
public class Father extends Handler {


    public Father(int _level) {
        super(_level);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-------女儿向父亲请示--------");
        System.out.println(women.getRequest());
        System.out.println("-------父亲的答复是:同意--------\n");
    }
}
