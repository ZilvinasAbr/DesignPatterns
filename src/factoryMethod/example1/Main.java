package factoryMethod.example1;

public class Main {
    public static void main(String[] args) {
        ICreator creator = new ConcreteCreator();
        IProduct product = creator.factoryMethod();
        System.out.println(product.getX());
    }
}
