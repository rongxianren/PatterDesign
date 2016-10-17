package com.rongxianren.patterdesign;

/**
 * Created by wty on 16/9/9.
 */
public class InnerClassTest {


    private int x;

    class MyInner {
        private String y = "Hello!";

        public void innerMethod() {
            System.out.println("内部类中 String =" + y);
            System.out.println("外部类中的x =" + x);// 直接访问外部类中的实例变量x
            outerMethod();
            System.out.println("x is" + InnerClassTest.this.x);
        }
    }

    public void outerMethod() {
        x++;
    }
}
