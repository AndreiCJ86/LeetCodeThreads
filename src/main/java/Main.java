public class Main {

    public static void main(String[] args) {

        Foo foo = new Foo();
        Thread t1 = new Thread(() -> callThread(foo::first, "first"));
        Thread t2 = new Thread(() -> callThread(foo::second, "second"));
        Thread t3 = new Thread(() -> callThread(foo::third, "third"));

        t1.start();
        t2.start();
        t3.start();

    }

    private static void callThread(FooInterface method, String text) {
        try {
            method.call(() -> System.out.print(text));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}