package org.example;

public class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDiscount() {
        return "Скидка 0%";
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Вес: " + weight);
        System.out.println("Скидка: " + getDiscount());
    }
}
