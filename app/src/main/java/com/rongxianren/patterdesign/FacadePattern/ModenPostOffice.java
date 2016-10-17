package com.rongxianren.patterdesign.FacadePattern;

/**
 * Created by wty on 16/9/8.
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();

    public ModenPostOffice() {
    }

    public void sendLetter(String context, String address) {
        if (null != letterProcess) {
            letterProcess.writeContext(context);
            letterProcess.fillEnvelope(address);
            police.checkLetter(letterProcess);
            letterProcess.letterInotoEnvelope();
            letterProcess.sendLetter();
        }
    }
}
