package com.rongxianren.patterdesign.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by wty on 16/9/8.
 */
public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectArrayList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectArrayList) {
        this.projectArrayList = projectArrayList;
    }


    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectArrayList.size()) {
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return (IProject) this.projectArrayList.get(this.currentItem++);
    }

    @Override
    public void remove() {

    }
}
