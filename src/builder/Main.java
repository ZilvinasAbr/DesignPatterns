package builder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        builder.add(12);
        builder.add(2);
        System.out.println(builder.getResult());
    }
}
