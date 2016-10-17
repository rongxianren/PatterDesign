package com.rongxianren.patterdesign.ShareObjectPattern;

import java.util.HashMap;

/**
 * Created by wty on 16/9/13.
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfoInstances() {
        return new SignInfo();
    }


    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "------------建立对象,并放置到池中------");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            System.out.println(key + "-------直接从池中取得--------");
            result = pool.get(key);
        }
        return result;
    }
}
