package org.example;
public class Electronics extends Product {
    private int warranty;

    public Electronics(String name, double price, double weight, int warranty) {
        super(name, price, weight);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    public void print1() {
        System.out.printf("привет electronics");;
    }
    @Override
    public String getDiscount() {
        return "Скидка 5%";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Гарантия: " + warranty + " мес.");
    }

    public void checkWarranty() {
        System.out.println("Проверка гарантии: " + warranty + " месяцев");
    }
}
