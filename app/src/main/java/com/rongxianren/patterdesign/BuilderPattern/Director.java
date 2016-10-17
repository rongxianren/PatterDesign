package com.rongxianren.patterdesign.BuilderPattern;

import com.rongxianren.patterdesign.BuilderPattern.builder.BMWBuilder;
import com.rongxianren.patterdesign.BuilderPattern.builder.BenzBuilder;
import com.rongxianren.patterdesign.BuilderPattern.model.BMWModel;
import com.rongxianren.patterdesign.BuilderPattern.model.BenzModel;
import com.rongxianren.patterdesign.BuilderPattern.model.CarModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wty on 16/5/17.
 */
public class Director {
    private List<CarModel.CarOperation> operations = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel(){
        this.operations.clear();
        this.operations.add(CarModel.CarOperation.ALARM);
        this.operations.add(CarModel.CarOperation.START);
        this.operations.add(CarModel.CarOperation.STOP);
        benzBuilder.setSequence(this.operations);
        return  benzBuilder.getCarModel();
    }


    public BenzModel getBBenzModel(){
        this.operations.clear();
        this.operations.add(CarModel.CarOperation.ALARM);
        this.operations.add(CarModel.CarOperation.STOP);
        benzBuilder.setSequence(this.operations);
        return benzBuilder.getCarModel();
    }


    public BMWModel getCBmwModel(){
        this.operations.clear();
        this.operations.add(CarModel.CarOperation.ALARM);
        this.operations.add(CarModel.CarOperation.STOP);
        bmwBuilder.setSequence(this.operations);
        return  bmwBuilder.getCarModel();
    }

    public BMWModel getDBmwModel(){
        this.operations.clear();
        this.operations.add(CarModel.CarOperation.ALARM);
        this.operations.add(CarModel.CarOperation.START);
        this.operations.add(CarModel.CarOperation.ENGINEBOOM);
        this.operations.add(CarModel.CarOperation.STOP);
        bmwBuilder.setSequence(this.operations);
        return  bmwBuilder.getCarModel();
    }
}
