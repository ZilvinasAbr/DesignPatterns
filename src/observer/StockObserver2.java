package observer;

public class StockObserver2 implements IObserver {
    @Override
    public void update() {
        System.out.println("StockObserver2 notified");
    }
}
