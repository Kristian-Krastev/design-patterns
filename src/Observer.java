public interface Observer {

    void doSomeWork();
    void addInvoker(Observable observable);
}
