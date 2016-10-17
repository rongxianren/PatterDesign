package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.decoratePattern;

/**
 * Created by wty on 16/9/18.
 */
public class BeautifyAppearance extends Decorator {

    public BeautifyAppearance(Swan swan) {
        super(swan);
    }

    @Override
    public void desappaerance() {
        System.out.println("外表白色,非常惹人喜爱.......");
    }
}
