package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("--------找到项目组---------");
    }

    @Override
    public void add() {
        System.out.println("----------添加一个新的需求------------");
    }

    @Override
    public void delete() {
        System.out.println("----------删除一个需求-------");
    }

    @Override
    public void change() {
        System.out.println("--------修改一个需求-------");
    }

    @Override
    public void plan() {
        System.out.println("-------要求给出所有需求变更的计划---------");
    }
}
