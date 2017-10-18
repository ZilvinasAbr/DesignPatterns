package abstractFactory;

public class ConcreteFactory2 implements IAbstractFactory {
    @Override
    public IAbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IAbstractProductB createProductB() {
        return new ProductB2();
    }
}
