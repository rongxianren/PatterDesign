package com.rongxianren.patterdesign.FactoryPattern;

/**
 * Created by wty on 16/5/18.
 */
public class HumanFactory {
    public static <T extends Human> T createHuman( Class<T> clazz ){
        Human human = null;
        try {
            human = clazz.newInstance();
        } catch (Exception e) {
           System.out.println("人种生成错误");
        }
        return (T)human;
    }
}
