package com.rongxianren.patterdesign;

import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wty on 16/9/9.
 */
public class Client {
    public static void main(String[] args) {

        List<? super Fruit> flist = new ArrayList<Fruit>();
        flist.add(new Fruit());
        flist.add(new Apple());
        flist.add(new RedApple());

    }


    static class Food {
    }

    static class Fruit extends Food {
    }

    static class Apple extends Fruit {
    }

    static class RedApple extends Apple {
    }
}
