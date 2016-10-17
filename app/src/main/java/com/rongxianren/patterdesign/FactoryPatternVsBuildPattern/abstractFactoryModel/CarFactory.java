package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.abstractFactoryModel;

import com.rongxianren.patterdesign.DynamicProxyPattern.IAdvice;

/**
 * Created by wty on 16/9/18.
 */
public interface CarFactory {
    ICar createSUV();

    ICar createVan();
}
