package com.rongxianren.patterdesign.strategyVSstatusPattern;

/**
 * Created by wty on 16/10/14.
 */

public class Client {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new ChildState());

        System.out.println("===童年时代天真烂漫===");
        human.work();

        System.out.println("\n===长大成人,肩负责任===");
        human.work();

        System.out.println("\n===步入暮年,享受天伦===");
        human.work();
    }
}
