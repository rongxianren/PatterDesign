package com.rongxianren.patterdesign.BuilderPattern.builder;

import com.rongxianren.patterdesign.BuilderPattern.model.CarModel;

import java.util.List;

/**
 * Created by wty on 16/5/17.
 */
public abstract class CarBuilder {


    public abstract void setSequence(List<CarModel.CarOperation> operations);

    public abstract CarModel getCarModel();
}
