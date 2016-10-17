package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.abstractFactoryModel;

/**
 * Created by wty on 16/9/18.
 */
public class BenzFactory implements CarFactory {
    @Override
    public ICar createSUV() {
        return new BenSuv();
    }

    @Override
    public ICar createVan() {
        return new BenVan();
    }
}
