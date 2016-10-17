package com.rongxianren.patterdesign.StrategyPattern;

/**
 * Created by wty on 16/9/7.
 */
public class Client {
    public static void main(String[] args) {
        IContext context;
        System.out.println("-----刚到吴国拆开了第一个锦囊----");
        context = new IContext(new BackDoor());
        context.operator();


        System.out.println("---刘备乐不思蜀拆开了第二个锦囊---");
        context = new IContext(new GivenGreenLight());
        context.operator();

        System.out.println("----孙权的小兵来追,咋办? 拆开第三个锦囊----");
        context = new IContext(new BlockEnemy());
        context.operator();


        System.out.println("---------Calculator.ADD.excu(10, 1)-------- = " + Calculator.ADD.excu(10, 1));
        System.out.println("---------Calculator.SUB.excu(10, 1)-------- = " + Calculator.SUB.excu(10, 1));
    }
}
