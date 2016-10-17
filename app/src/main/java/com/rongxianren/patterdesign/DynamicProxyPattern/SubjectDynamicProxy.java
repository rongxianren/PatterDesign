package com.rongxianren.patterdesign.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;

/**
 * Created by wty on 16/6/10.
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstances(IGamePlayer gamePlayer) {
        ClassLoader loader = gamePlayer.getClass().getClassLoader();
        Class<?>[] interfaces = gamePlayer.getClass().getInterfaces();
        InvocationHandler handler = new GamePlayerIH(gamePlayer);
        T target = newProxyInstances(loader, interfaces, handler);
        return target;
    }
}
