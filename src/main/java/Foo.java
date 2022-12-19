public class Foo {

    private int count;
    public Foo() {
    }

    public void first(Runnable printFirst) {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count++;
    }

    public void second(Runnable printSecond) {
        while(count < 1){}

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        count++;
    }

    public void third(Runnable printThird) {
        while(count < 2){}

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
