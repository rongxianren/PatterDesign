package com.rongxianren.patterdesign.ProxyPatternVSDecoratePattern.proxyPattern;

/**
 * Created by wty on 16/9/18.
 */
public class Client {
    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner agent = new RunnerAgent(runner);
        System.out.println("====客人找到运动员的代理要求其去跑步====");
        agent.run();
    }
}
