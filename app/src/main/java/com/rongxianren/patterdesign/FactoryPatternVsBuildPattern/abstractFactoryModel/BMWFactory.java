package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.abstractFactoryModel;

/**
 * Created by wty on 16/9/18.
 */
public class BMWFactory implements CarFactory {
    @Override
    public ICar createSUV() {
        return new BMWSuv();
    }

    @Override
    public ICar createVan() {
        return new BMWVan();
    }
}
