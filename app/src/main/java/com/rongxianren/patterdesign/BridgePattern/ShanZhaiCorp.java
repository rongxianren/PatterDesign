package com.rongxianren.patterdesign.BridgePattern;

/**
 * Created by wty on 16/9/14.
 */
public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("-----山寨公司不好做啊,赚的钱也少----");
    }
}
