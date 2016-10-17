package com.rongxianren.patterdesign.FactoryPattern;

/**
 * Created by wty on 16/5/18.
 */
public class NvWa {
    public static void main(String[] args) {
        BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println();

        WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println();


        YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
