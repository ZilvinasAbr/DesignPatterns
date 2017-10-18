package prototype;

class Product implements Cloneable {
    Stuff stuff;

    Product() {
        stuff = new Stuff();
    }

    Product makeCopy() {
        try {
            return (Product) this.clone();
        } catch(CloneNotSupportedException ex) {
            ex.printStackTrace();
            return this;
        }
    }
}
