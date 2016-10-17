package com.rongxianren.patterdesign.ShareObjectPattern;

/**
 * Created by wty on 16/9/13.
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
