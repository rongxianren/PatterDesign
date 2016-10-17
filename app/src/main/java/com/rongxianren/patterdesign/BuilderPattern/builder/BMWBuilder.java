package com.rongxianren.patterdesign.BuilderPattern.builder;

import com.rongxianren.patterdesign.BuilderPattern.model.BMWModel;
import com.rongxianren.patterdesign.BuilderPattern.model.CarModel;

import java.util.List;

/**
 * Created by wty on 16/5/17.
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(List<CarModel.CarOperation> operations) {
        bmwModel.setSequence(operations);
    }

    @Override
    public BMWModel getCarModel() {
        return bmwModel;
    }
}
