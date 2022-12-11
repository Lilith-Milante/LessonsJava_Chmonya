package OOP_Homework1;

/* Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
сохраняющий в себе список исходных продуктов и getProduct(String name)*/

public class Product {
    protected double price;
    protected String name;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " " + price;
    }
}
