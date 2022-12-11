package OOP_Homework1.Home;

/* Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре */

public class HotDrink {

    protected String name;
    protected double price;
    protected Double volume;

    public HotDrink(String name, double price, Double volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;

    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " " + price;
    }

    public String drinkDone() {
        return "Drink " + this.name + "at a price " + this.price + "with volume " + this.volume + "done!";
    }
}