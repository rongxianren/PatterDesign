package com.rongxianren.patterdesign.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wty on 16/6/10.
 */
public class GamePlayerIH implements InvocationHandler {

    Object target = null;

    public GamePlayerIH(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        try {
            if (method.getName().equalsIgnoreCase("login")) {
                System.out.println(args[0] + " 你的账号登录了,如果不是本人操作请注意-----");
            }
            result = (Object) method.invoke(target, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
