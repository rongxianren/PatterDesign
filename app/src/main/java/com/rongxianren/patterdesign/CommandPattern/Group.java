package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public abstract class Group {
    /**
     * 找到项目组
     */
    public abstract void find();

    /**
     * 增加新功能
     */
    public abstract void add();

    /**
     * 删除功能
     */
    public abstract void delete();

    /**
     * 修改功能
     */
    public abstract void change();

    /**
     * 给出所有的变更的计划
     */
    public abstract void plan();
}
