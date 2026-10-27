package org.example;

public class Car {
    private String brand;
    private int year;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public Car (String brand, int year, double price){
        setBrand(brand);
        setPrice(price);
        setYear(year);

    }

    @Override
    public String toString() {
        return brand + " " + year + " " + price;
    }
}
