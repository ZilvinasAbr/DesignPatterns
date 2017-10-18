package observer;

public class StockObserver1 implements IObserver {
    @Override
    public void update() {
        System.out.println("StockObserver1 notified");
    }
}
