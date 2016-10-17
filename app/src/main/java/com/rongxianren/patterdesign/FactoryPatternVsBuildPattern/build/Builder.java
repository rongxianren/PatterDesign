package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.build;

/**
 * Created by wty on 16/9/14.
 */
public abstract class Builder {
    protected SuperMan superMan = new SuperMan();

    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    public void setSpecialTalent(String st) {
        this.superMan.setSpecialTalent(st);
    }

    public void setSpecialSymbol(String ss) {
        this.superMan.setSpecialSymbol(ss);
    }

    public abstract SuperMan getSuperMan();
}
