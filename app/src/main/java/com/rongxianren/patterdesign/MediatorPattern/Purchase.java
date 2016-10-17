package com.rongxianren.patterdesign.MediatorPattern;

/**
 * Created by wty on 16/8/31.
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

}
