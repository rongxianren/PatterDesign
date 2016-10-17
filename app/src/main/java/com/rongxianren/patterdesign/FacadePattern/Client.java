package com.rongxianren.patterdesign.FacadePattern;

/**
 * Created by wty on 16/9/8.
 */
public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String address = "Happy Road No.666,God Province,Heaven";
        String context = "Hello, It's me, do you know who Iam ? I'm you old friend.";

        modenPostOffice.sendLetter(context, address);
    }
}
