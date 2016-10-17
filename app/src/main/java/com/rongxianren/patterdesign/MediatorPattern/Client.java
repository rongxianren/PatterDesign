package com.rongxianren.patterdesign.MediatorPattern;

/**
 * Created by wty on 16/8/31.
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("\n---------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        System.out.println("\n---------销售人员销售电脑---------");
        Sale sale = new Sale(mediator);
        sale.sellIBMcomputer(1);

        System.out.println("-----------\n库房管理人员清库存处理---------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
