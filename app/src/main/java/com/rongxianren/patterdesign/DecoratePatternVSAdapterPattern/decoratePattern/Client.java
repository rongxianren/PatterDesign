package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.decoratePattern;

import javax.crypto.spec.DESKeySpec;

/**
 * Created by wty on 16/9/18.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====很久很久以前,这里有一只丑陋的小鸭子===");
        Swan duckling = new UglyDuckling();
        duckling.desappaerance();
        duckling.fly();
        duckling.cry();

        System.out.println("\n===丑小鸭终于发现自己是一只天鹅===");
        duckling = new BeautifyAppearance(duckling);
        duckling = new StrongBehavior(duckling);

        duckling.desappaerance();
        duckling.fly();
        duckling.cry();
    }
}
