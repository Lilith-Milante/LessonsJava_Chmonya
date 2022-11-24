package OOP_HW1.Sem1.Task1;

public class Water extends ProductAbstr implements VendingInterface {

    private boolean isSparkling;
    private double volume;

    public Water(String name, double price, String currency, boolean isSparkling, double volume) {
        this.volume = volume;
        this.isSparkling = isSparkling;
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
        String sparkle = isSparkling ? "Sparkling" : "still";
        return "We sold one " + sparkle + "bottle of water " + super.name + " " + this.volume + "at a price " + super.price;
    }
}
