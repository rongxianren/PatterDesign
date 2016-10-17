package com.rongxianren.patterdesign.FactoryPatternVsBuildPattern.abstractFactoryModel;

/**
 * Created by wty on 16/9/18.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====  要求生产一辆奔驰SUV  ====");
        CarFactory carFactory = new BenzFactory();
        ICar benzSuv = carFactory.createSUV();
        ICar benzVan = carFactory.createVan();

        System.out.println(" ------benzSuv----- info is  brand: " + benzSuv.getBand() + "  model :" + benzSuv.getBand());
        System.out.println(" ------benzVan----- info is  brand: " + benzVan.getBand() + "  model :" + benzVan.getBand());
    }
}