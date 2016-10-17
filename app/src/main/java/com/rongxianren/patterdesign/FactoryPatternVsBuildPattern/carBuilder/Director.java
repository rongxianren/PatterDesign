package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.carBuilder;

/**
 * Created by wty on 16/9/18.
 */
public class Director {

    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bmwBuidler = new BMWBuilder();

    public ICar createBenzSuv() {
        return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
    }

    public ICar createBMWVan() {
        return createCar(bmwBuidler, "BMW的引擎", "BMW的轮胎");
    }

    public ICar createComplexCar() {
        return createCar(bmwBuidler, "BMW的引擎", "benz的轮胎");
    }

    private ICar createCar(CarBuilder carBuilder, String engine, String wheel) {
        Blueprint bp = new Blueprint();
        bp.setEngine(engine);
        bp.setWheel(wheel);

        System.out.println("获得生产蓝图!!!");

        carBuilder.receiveBlueprint(bp);
        return carBuilder.buildCar();
    }
}
