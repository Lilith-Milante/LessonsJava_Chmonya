package OOP_HW1.Sem1.Task1;

public abstract class ProductAbstr {

    protected double price;
    protected String name;
    protected static String currency;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.currency + price;
    }
}
