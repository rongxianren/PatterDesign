package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.build;

/**
 * Created by wty on 16/9/14.
 */
public class ChildSuperManBuilder extends Builder {
    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的身体");
        super.setSpecialTalent("----刀枪不入----");
        super.setSpecialSymbol("胸前带有小S标记");
        return super.superMan;
    }
}
