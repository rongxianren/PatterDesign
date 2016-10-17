package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.build;

/**
 * Created by wty on 16/9/14.
 */
public class AdultSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("会飞行");
        super.setSpecialSymbol("胸前带S标记");
        return super.superMan;
    }
}
