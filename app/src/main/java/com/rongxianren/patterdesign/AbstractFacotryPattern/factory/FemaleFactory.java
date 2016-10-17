package com.rongxianren.patterdesign.AbstractFacotryPattern.factory;

import com.rongxianren.patterdesign.AbstractFacotryPattern.human.FemaleBlackHuman;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.FemaleWhiteHuman;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.FemaleYellowHuman;
import com.rongxianren.patterdesign.AbstractFacotryPattern.human.Human;

/**
 * Created by wty on 16/5/18.
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
