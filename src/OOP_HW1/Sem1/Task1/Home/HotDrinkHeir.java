package OOP_HW1.Sem1.Task1.Home;

public class HotDrinkHeir extends HotDrink {

    int temperature;

    public HotDrinkHeir(String name, double price, Double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
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
    public String toString() {
        return super.toString();
    }

    @Override
    public String drinkDone() {
        return "Drink " + super.name + "at a price " + super.price + "with volume " + super.volume + "and temp " + this.temperature + "done!";
    }
}
