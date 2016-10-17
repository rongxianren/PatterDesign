package com.rongxianren.patterdesign.FacadePattern;

/**
 * Created by wty on 16/9/8.
 */
public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "  信件已经检查过了....");

    }
}
