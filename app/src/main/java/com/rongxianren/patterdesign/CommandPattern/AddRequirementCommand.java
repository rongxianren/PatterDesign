package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        rg.find();

        rg.add();

        rg.plan();
    }
}
