public class Listener implements Observer {

    String text;
    Observable invoker;

    public Listener(String text) {
        this.text = text;
    }
    @Override
    public void doSomeWork() {
        System.out.println("Observer " + text + " method called");
    }

    @Override
    public void addInvoker(Observable observable) {
        invoker = observable;
    }
}
