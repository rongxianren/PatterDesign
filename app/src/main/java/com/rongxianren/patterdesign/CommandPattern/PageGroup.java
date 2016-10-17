package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("-------找到美工组-------");
    }

    @Override
    public void add() {
        System.out.println("--------添加一个新的页面--------");
    }

    @Override
    public void delete() {
        System.out.println("---------删除一个页面-------");
    }

    @Override
    public void change() {
        System.out.println("----------改变一个页面--------");
    }

    @Override
    public void plan() {
        System.out.println("-----------要求给出所有页面变更的计划--------");
    }
}
