package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class Invoker {
    private Command command;

    public void setAction(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
