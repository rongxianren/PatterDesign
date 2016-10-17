package com.rongxianren.patterdesign.MemorialPattern;

/**
 * Created by wty on 16/9/8.
 */
public class Boy {
    private String state;

    public void changeState() {
        this.state = "心情可能不是很好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento createMemento() {
        return new Memento(this.state);
    }

    void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
