package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
