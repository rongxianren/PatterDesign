package com.rongxianren.patterdesign.MediatorPattern;

import java.util.Random;

/**
 * Created by wty on 16/8/31.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMcomputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑销售情况为:"+ saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
