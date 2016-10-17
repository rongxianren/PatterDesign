package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.adapterPattern;

/**
 * Created by wty on 16/9/18.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===鸭妈妈有五个孩子,其中四个模样是这样的: ===");
        Duck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();

        System.out.println("\n===一只独特的小鸭子,模样是这样的: ===");
        Duck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.desAppearance();
        uglyDuckling.desBehavior();
    }
}
