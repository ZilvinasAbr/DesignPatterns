package observer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ISubject subject = new StockGrabber();

        IObserver observer1 = new StockObserver1();
        IObserver observer2 = new StockObserver2();

        subject.register(observer1);
        subject.register(observer2);
        subject.notifyObservers();
        subject.unregister(observer1);
        subject.notifyObservers();
        subject.unregister(observer2);
        subject.notifyObservers();
        subject.notifyObservers();
        subject.notifyObservers();
        subject.notifyObservers();
    }
}
