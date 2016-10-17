package com.rongxianren.patterdesign.DynamicProxyPattern;

/**
 * Created by wty on 16/6/10.
 */
public class GamerPlayer implements IGamePlayer {
    private String user;

    public GamerPlayer(String user) {
        this.user = user;
    }

    @Override
    public void login(String user, String password) {
        System.out.println(user + "又成功升一级了......");
    }

    @Override
    public void killBoss() {
        System.out.println(user + "开始打怪了......");
    }

    @Override
    public void upgrade() {
        System.out.println("哇塞 " + user + "又升一级了......");
    }
}
