package com.rongxianren.patterdesign.MediatorPattern;

/**
 * Created by wty on 16/8/31.
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String command, Object... objects);
}
