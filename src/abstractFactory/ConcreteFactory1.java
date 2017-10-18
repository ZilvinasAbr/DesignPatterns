package abstractFactory;

public class ConcreteFactory1 implements IAbstractFactory {
    @Override
    public IAbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IAbstractProductB createProductB() {
        return new ProductB1();
    }
}
