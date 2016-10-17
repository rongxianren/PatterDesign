package com.rongxianren.patterdesign.BuilderPattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wty on 16/5/17.
 */
public abstract class CarModel {

    private List<CarOperation> operations = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public void run() {
        if (null != operations) {
            for (CarOperation operation : operations) {
                switch (operation) {
                    case START:
                        start();
                        break;
                    case STOP:
                        stop();
                        break;
                    case ALARM:
                        alarm();
                        break;
                    case ENGINEBOOM:
                        engineBoom();
                        break;
                }
            }
        }
    }

    public void setSequence(List<CarOperation> operations) {
        this.operations = operations;
    }

    public enum CarOperation {
        START, STOP, ALARM, ENGINEBOOM;
    }
}
