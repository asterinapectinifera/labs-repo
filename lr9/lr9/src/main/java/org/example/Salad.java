package org.example;

public class Salad extends Food{
    private String dressing;

    public Salad(String name, int calories, double price, String dressing) {
        super(name, calories, price);
        this.dressing = dressing;
    }

    public String getDressing() { return dressing; }
    public void setDressing(String dressing) { this.dressing = dressing; }

    @Override
    public String cook() {
        return "Нарезается и смешивается";
    }

    @Override
    public int getExpirationDays() {
        return 1;
    }

    @Override
    public void displayInfo() {
        System.out.println("САЛАТ: " + getName());
        super.displayInfo();
        System.out.println("  Срок годности: " + getExpirationDays() + " день");
    }
}
