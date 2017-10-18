package abstractFactory;

public class Main {

    public static void main(String[] args) {
        IAbstractFactory factory = new ConcreteFactory1();

        IAbstractProductA product = factory.createProductA();

        product.hello();
    }
}