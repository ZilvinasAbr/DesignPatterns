package observer;

import java.util.LinkedList;

public class StockGrabber implements ISubject {
    private LinkedList<IObserver> observers = new LinkedList<>();

    @Override
    public void register(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update();
        }
    }
}
