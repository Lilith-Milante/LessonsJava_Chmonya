package HW6;

public class Cat {
    int monthBirth;
    int yearBirth;
    String nameCat;
    CatOwner catOwner;
    char catMale;

    public Cat(String nameCat, CatOwner catOwner) {
        this.nameCat = nameCat;
        this.catOwner = catOwner;

    }

    public int getMonthBirth() {
        return monthBirth;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", catOwner=" + catOwner +
                ", catMale=" + catMale +
                '}';
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public CatOwner getCatOwner() {
        return catOwner;
    }

    public void setCatOwner(CatOwner catOwner) {
        this.catOwner = catOwner;
    }

    public char getCatMale() {
        return catMale;
    }

    public void setCatMale(char catMale) {
        this.catMale = catMale;
    }

    public boolean isMail() {
        return this.catMale == 'M';
    }
}
