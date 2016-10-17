package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class Client {


    public static void main(String[] args) {
        Invoker wuming = new Invoker();
        System.out.println("----------客户需要增加一项需求------------");
        AddRequirementCommand command = new AddRequirementCommand();
        wuming.setAction(command);
        wuming.action();
    }
}
