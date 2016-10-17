package com.rongxianren.patterdesign.AbstractFacotryPattern.factory;

import com.rongxianren.patterdesign.AbstractFacotryPattern.human.Human;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.ManBlackHuman;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.ManWhiteHuman;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.ManYellowHuman;

/**
 * Created by wty on 16/5/18.
 */
public class ManFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new ManYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new ManBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new ManWhiteHuman();
    }
}
