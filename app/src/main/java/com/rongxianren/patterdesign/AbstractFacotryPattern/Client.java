package com.rongxianren.patterdesign.AbstractFacotryPattern;

import com.rongxianren.patterdesign.AbstractFacotryPattern.factory.FemaleFactory;
import com.rongxianren.patterdesign.AbstractFacotryPattern.factory.HumanFactory;
import com.rongxianren.patterdesign.AbstractFacotryPattern.factory.ManFactory;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.Human;

/**
 * Created by wty on 16/5/18.
 */
public class Client {

    public static void main(String[] args) {
        HumanFactory femaleHumanFactory = new FemaleFactory();
        HumanFactory maleHumanFactory = new ManFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();


        System.out.println("---造出了一个黄色男人---");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        System.out.println("----造出了一个黄色女人----");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
    }
}
