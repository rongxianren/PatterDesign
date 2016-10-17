package com.rongxianren.patterdesign.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wty on 16/6/10.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstances(ClassLoader loaer, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            (new BeforeAdvice()).execu();
        }

        T target = (T) Proxy.newProxyInstance(loaer, interfaces, handler);

        if (true) {
            (new AfterAdvice()).execu();
        }
        return target;
    }
}
