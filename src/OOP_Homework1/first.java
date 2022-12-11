package OOP_Homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class first {
    public static void main(String[] args) {

        Product item = new Product("Chips", 20);
        Product item2 = new Product("Juice", 15);
        Product item3 = new Product("Water", 10);

        ArrayList<Product> assort = new ArrayList<>(Arrays.asList(new Product[]{item, item2, item3}));
        VendingMachine v1 = new VendingMachine();
        v1.initProducts(assort);

        Logger log1 = Logger.getAnonymousLogger();
        log1.info(v1.checkAssortment().toString());
        log1.info(v1.getProduct("Water").toString());
        log1.info(v1.checkAssortment().toString());

        Chocolates choco = new Chocolates("moloch", 100, "R", "black");
        log1.info(choco.getName());
        log1.info(String.valueOf(choco.getPrice()));
        log1.info(choco.sellItem());

        Water aquaWater = new Water("Aqua Minerale", 50, "S", true, 0.5);
        log1.info(aquaWater.getName());
        log1.info(String.valueOf(aquaWater.getPrice()));
        log1.info(aquaWater.sellItem());
    }
}