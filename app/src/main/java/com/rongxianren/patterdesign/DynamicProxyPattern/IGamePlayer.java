package com.rongxianren.patterdesign.DynamicProxyPattern;

/**
 * Created by wty on 16/6/10.
 */
public interface IGamePlayer {
    void login(String user, String password);
    void killBoss();
    void upgrade();
}
