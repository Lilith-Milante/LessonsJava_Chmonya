package HW6;

public class CatOwner {
    public String name;

    public CatOwner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CatOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}
