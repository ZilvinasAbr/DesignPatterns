package builder;

public class ConcreteBuilder implements IBuilder {
    private int result = 0;

    @Override
    public void add(int a) {
        result += a;
    }

    @Override
    public int getResult() {
        return result;
    }
}
