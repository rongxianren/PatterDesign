package com.rongxianren.patterdesign.CommandPattern;

/**
 * Created by wty on 16/9/1.
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        pg.find();

        pg.delete();


        pg.plan();
        
    }
}
