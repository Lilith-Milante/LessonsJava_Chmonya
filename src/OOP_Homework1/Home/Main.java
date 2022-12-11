package OOP_Homework1.Home;


import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        HotDrinkHeir drink1 = new HotDrinkHeir("Green tea", 50, 0.4, 80);
        HotDrinkHeir drink2 = new HotDrinkHeir("Black tea", 50, 0.4, 80);
        HotDrinkHeir drink3 = new HotDrinkHeir("Coffee Latte", 80, 0.3, 85);
        HotDrinkHeir drink4 = new HotDrinkHeir("Kissel", 70, 0.5, 80);

        HotDrinkHeir[] tea = {drink1, drink2};
        HotDrinkHeir[] coffee = {drink3};
        HotDrinkHeir[] kissel = {drink4};

        HotDrinksVendingMachine cup1 = new HotDrinksVendingMachine(tea);
        HotDrinksVendingMachine cup2 = new HotDrinksVendingMachine(coffee);
        HotDrinksVendingMachine cup3 = new HotDrinksVendingMachine(kissel);

        Logger logger1 = Logger.getAnonymousLogger();
        logger1.info(String.valueOf(cup1.getProduct("Black tea", 0.4, 80)));
        logger1.info(String.valueOf(cup1.getProduct("Oolong tea", 0.4, 75)));
    }
}
