package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("-----找到编码组-----");
    }

    @Override
    public void add() {
        System.out.println("-----添加一个新功能-----");
    }

    @Override
    public void delete() {
        System.out.println("-----要求删除一个功能-----");
    }

    @Override
    public void change() {
        System.out.println("-----要求改变一个功能-----");
    }

    @Override
    public void plan() {
        System.out.println("----要求给出所有功能变更的计划-----");
    }
}
