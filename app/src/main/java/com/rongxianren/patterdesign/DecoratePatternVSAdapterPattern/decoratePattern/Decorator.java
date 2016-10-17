package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.decoratePattern;

/**
 * Created by wty on 16/9/18.
 */
public class Decorator implements Swan {

    private Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desappaerance() {
        swan.desappaerance();
    }
}
