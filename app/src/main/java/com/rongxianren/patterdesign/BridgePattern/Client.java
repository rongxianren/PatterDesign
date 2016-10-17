package com.rongxianren.patterdesign.BridgePattern;

/**
 * Created by wty on 16/9/14.
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        System.out.println("房地产公司是这样运行的");
        houseCorp.makeMoney();


        System.out.println("\n");
        IPod iPod = new IPod();
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(iPod);
        System.out.println("山寨公司是这样运行的");
        shanZhaiCorp.makeMoney();


        System.out.println("\n");
        Clothes clothes = new Clothes();
        ShanZhaiCorp shanZhaiCorp1 = new ShanZhaiCorp(clothes);
        System.out.println("山寨服装生意是这样运行的");
        shanZhaiCorp1.makeMoney();
    }
}
