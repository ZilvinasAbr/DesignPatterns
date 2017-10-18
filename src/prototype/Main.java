package prototype;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        Product copy = product.makeCopy();

        System.out.println(product.stuff.hashCode());
        System.out.println(copy.stuff.hashCode());
    }
}
