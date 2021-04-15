
public interface Observable {

    void addListener(Observer observer);
    void removeListener(Observer observer);

    void doSomething();
}
