package test;

/**
 * Created by wty on 16/10/10.
 */

public class GenericsTest {
    public static void main(String[] args) {
        Hello hello = new Hello();
        TestHello<Hello> testHello = new TestHello<>(hello);
        testHello.callHello();
    }
    
    static class Hello {
        public void hello() {
            System.out.println("hello");
        }
    }

    static class TestHello<T extends Hello> {
        private T t;

        public TestHello(T t) {
            this.t = t;
        }

        public void callHello() {
            t.hello();
        }
    }
}
