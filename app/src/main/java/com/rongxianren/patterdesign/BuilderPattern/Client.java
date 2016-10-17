package com.rongxianren.patterdesign.BuilderPattern;

/**
 * Created by wty on 16/5/17.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        System.out.println("\n");


        director.getBBenzModel().run();
        System.out.println("\n");


        director.getCBmwModel().run();
        System.out.println("\n");

        director.getDBmwModel().run();
    }
}
