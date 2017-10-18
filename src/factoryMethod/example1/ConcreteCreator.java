package factoryMethod.example1;

public class ConcreteCreator implements ICreator {
    @Override
    public IProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
