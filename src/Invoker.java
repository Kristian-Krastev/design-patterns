import java.util.LinkedList;
import java.util.List;

public class Invoker implements Observable {

    private List<Observer> listeners = new LinkedList<>();

    @Override
    public void addListener(Observer observer) {
        listeners.add(observer);
    }

    @Override
    public void removeListener(Observer observer) {
        listeners.remove(observer);
    }

    @Override
    public void doSomething() {
        System.out.println("Observable method called");
        notifyListeners();
    }

    private void notifyListeners() {
        for (Observer observer : listeners){
            observer.doSomeWork();
        }
    }
}
