package com.rongxianren.patterdesign.MediatorPattern;

/**
 * Created by wty on 16/8/31.
 */
public class Mediator extends AbstractMediator {


    @Override
    public void execute(String command, Object... objects) {
        switch (command) {
            case "purchase.buy":
                this.buyComputer((int) (objects[0]));
                break;
            case "sale.sell":
                this.sellComputer((int) objects[0]);
                break;
            case "sale.offsell":
                this.offSell();
                break;
            case "stock.clear":
                this.clearStock();
                break;
        }
    }


    private void buyComputer(int number) {
        int scaleStatus = super.sale.getSaleStatus();
        if (scaleStatus > 80) {
            System.out.println("采购IBM电脑" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        } else {
            super.stock.decrease(number);
        }
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
