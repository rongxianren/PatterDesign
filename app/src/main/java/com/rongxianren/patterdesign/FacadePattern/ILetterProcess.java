package com.rongxianren.patterdesign.FacadePattern;

/**
 * Created by wty on 16/9/8.
 */
public interface ILetterProcess {
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterInotoEnvelope();

    void sendLetter();
}
