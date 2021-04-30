public class Main {
    public static void main(String[] args) {

        Observer listener1 = new Listener("1");
        Observer listener2 = new Listener("2");
        Observer listener3 = new Listener("3");

        Observable invoker = new Invoker();
        invoker.addListener(listener1);
        invoker.addListener(listener2);
        invoker.addListener(listener3);

        listener1.addInvoker(invoker);
        listener2.addInvoker(invoker);
        listener3.addInvoker(invoker);

        invoker.doSomething();
    }
}
