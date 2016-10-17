package com.rongxianren.patterdesign.ResponsibleChainPatter;

/**
 * Created by wty on 16/7/7.
 */
public class Woman implements IWomen {

    private int type = 0;
    private String request = "";

    public Woman(int type, String request) {
        this.type = type;
        switch (type) {
            case Handler.FATHER_LEVEL_REQUEST:
                this.request = "女儿的请求是: " + request;
                break;
            case Handler.HUSBAND_LEVEL_REQUEST:
                this.request = "妻子的请求是: " + request;
                break;
            case Handler.SON_LEVEL_REQUEST:
                this.request = "母亲的请求是: " + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
