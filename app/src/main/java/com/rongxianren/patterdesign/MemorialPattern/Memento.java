package com.rongxianren.patterdesign.MemorialPattern;

/**
 * Created by wty on 16/9/8.
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
