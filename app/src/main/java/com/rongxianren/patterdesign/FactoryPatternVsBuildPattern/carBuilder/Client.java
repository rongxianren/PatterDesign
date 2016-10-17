package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.carBuilder;

/**
 * Created by wty on 16/9/18.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ICar benzCar = director.createBenzSuv();
        ICar bmwCar = director.createBMWVan();
        ICar complexCar = director.createComplexCar();

        System.out.println("-------benzCar info is ------- engine " + benzCar.getEngine() + "  wheel: " + benzCar.getWheel());
        System.out.println("-------bmwCar info is ------- engine " + bmwCar.getEngine() + "  wheel: " + bmwCar.getWheel());
        System.out.println("-------complexCar info is ------- engine " + complexCar.getEngine() + "  wheel: " + complexCar.getWheel());
    }
}
