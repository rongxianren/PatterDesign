package com.rongxianren.patterdesign.ProxyPatternVSDecoratePattern.proxyPattern;

import java.util.Random;

/**
 * Created by wty on 16/9/18.
 */
public class RunnerAgent implements IRunner {

    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("代理人同意安排运动员跑步");
            runner.run();
        } else {
            System.out.println("代理人心情不好,不安排运动员跑步");
        }
    }
}
