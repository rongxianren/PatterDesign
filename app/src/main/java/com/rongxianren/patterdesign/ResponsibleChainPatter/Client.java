package com.rongxianren.patterdesign.ResponsibleChainPatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by wty on 16/7/7.
 */
public class Client {

    public static void main(String[] args) {
        List<IWomen> womenList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            IWomen women = new Woman(random.nextInt(3) + 1, "我要出去浪");
            System.out.println("------n----- = " + women.getType());

            womenList.add(women);
        }

        Handler father = new Father(Handler.FATHER_LEVEL_REQUEST);
        Handler husband = new Husband(Handler.HUSBAND_LEVEL_REQUEST);
        Handler son = new Son(Handler.SON_LEVEL_REQUEST);
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen women : womenList) {
            father.handleMessage(women);
        }


    }
}
