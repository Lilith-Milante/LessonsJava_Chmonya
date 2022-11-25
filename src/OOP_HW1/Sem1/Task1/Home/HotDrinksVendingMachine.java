package OOP_HW1.Sem1.Task1.Home;

import java.util.ArrayList;

public class HotDrinksVendingMachine implements VendingMachine { // используется классами для реализации интерфейса. Класс, реализующий интерфейс, должен обеспечить реализацию всех его метода, если только это не абстрактный класс.

    private ArrayList<HotDrinkHeir> allDrinks = new ArrayList<>(); // HotDrinkHeir потому что оттуда берутся объекты, наследник, потому что ещё температура


    public void addProduct(HotDrinkHeir item) {
        this.allDrinks.add(item);
    }


    public HotDrinkHeir getProduct(String name, double volume, int temperature) {

        for (int i = 0; i < allDrinks.size(); i++) {

            if (allDrinks.get(i).volume.equals(volume) && allDrinks.get(i).name.equals(name) && allDrinks.get(i).temperature == (temperature)) {
                return allDrinks.get(i);
            }
        }
        return new HotDrinkHeir("Absence! Nothing to count as price and other ", + 0, + 0, + 0);
    }
}
