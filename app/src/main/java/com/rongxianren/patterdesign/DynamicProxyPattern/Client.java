package com.rongxianren.patterdesign.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;

/**
 * Created by wty on 16/6/10.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamerPlayer("wty");
        InvocationHandler handler = new GamePlayerIH(gamePlayer);

        ClassLoader loader = gamePlayer.getClass().getClassLoader();
//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[]{IGamePlayer.class}, handler);
//        IGamePlayer proxy = (IGamePlayer) DynamicProxy.newProxyInstances(gamePlayer.getClass().getClassLoader(), gamePlayer.getClass().getInterfaces(), handler);
        IGamePlayer proxy = SubjectDynamicProxy.newProxyInstances(gamePlayer);
        proxy.login("wty", "password");
        proxy.killBoss();
        proxy.upgrade();
    }

}
