package com.rongxianren.patterdesign.BuilderPattern.builder;

import com.rongxianren.patterdesign.BuilderPattern.model.BenzModel;
import com.rongxianren.patterdesign.BuilderPattern.model.CarModel;

import java.util.List;

/**
 * Created by wty on 16/5/17.
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<CarModel.CarOperation> operations) {
        benzModel.setSequence(operations);
    }

    @Override
    public BenzModel getCarModel() {
        return benzModel;
    }
}
