package OOP_Homework1;

public class Chocolates extends ProductAbstr implements VendingInterface {

    private String color;

    public Chocolates(String name, double price, String currency, String color) {
        this.color = color;
        super.name = name; // супер потому что не его параметр, не отсюда
        super.price = price;
        super.currency = currency;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String sellItem() {
        return "We sold one " + this.color + "chocolate " + super.name + "at a price " + super.price;
    }
}
