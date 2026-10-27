package org.example;

public  abstract class Food {
    private String name;
    private int calories;
    private double price;

    public Food(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract String cook();
    public abstract int getExpirationDays();

    public void displayInfo() {
        System.out.println(name);
        System.out.println("  Калории: " + calories + " ккал");
        System.out.println("  Цена: " + price + " руб.");
        System.out.println("  Способ приготовления: " + cook());
        System.out.println("  Срок годности: " + getExpirationDays() + " дн.");
    }
}
