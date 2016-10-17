package com.rongxianren.patterdesign.StrategyPattern;

/**
 * Created by wty on 16/9/8.
 */
public enum Calculator {
    ADD("+") {
        @Override
        public int excu(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int excu(int a, int b) {
            return a - b;
        }
    };


    private String value;

    public String getValue() {
        return value;
    }

    Calculator(String value) {
        this.value = value;
    }

    public abstract int excu(int a, int b);
}
