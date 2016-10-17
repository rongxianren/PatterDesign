package com.rongxianren.patterdesign.IteratorPattern;

/**
 * Created by wty on 16/9/8.
 */
public interface IProject {
    String getProjectInfo();

    void add(String name, int num, int cost);

    IProjectIterator iterator();
}
