package org.example;

public class Food extends Product{
    private String expirationDate;

    public Food(String name, double price, double weight, String expirationDate) {
        super(name, price, weight);
        this.expirationDate = expirationDate;
    }
    public void print() {
        System.out.printf("привет food");;
    }
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDiscount() {
        return "Скидка 15%";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Срок годности: " + expirationDate);
    }

    public void isExpired() {
        System.out.println("Проверка срока годности: " + expirationDate);
    }
}
