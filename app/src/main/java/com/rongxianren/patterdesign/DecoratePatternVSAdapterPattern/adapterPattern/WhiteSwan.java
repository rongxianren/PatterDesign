package com.rongxianren.patterdesign.DecoratePatternVSAdapterPattern.adapterPattern;

/**
 * Created by wty on 16/9/18.
 */
public class WhiteSwan implements Swan {
    @Override
    public void fly() {
        System.out.println(" 白天鹅还会飞哦......");
    }

    @Override
    public void cry() {
        System.out.println("天鹅是 克鲁....克鲁....的叫的");
    }

    @Override
    public void desAppaearance() {
        System.out.println("天鹅全身雪白,非常可爱.....");
    }
}
