package com.rongxianren.patterdesign.AbstractFacotryPattern.factory;

import com.rongxianren.patterdesign.AbstractFacotryPattern.human.Human;

/**
 * Created by wty on 16/5/18.
 */
public interface HumanFactory {
    Human createYellowHuman();
    Human createBlackHuman();
    Human createWhiteHuman();
}
