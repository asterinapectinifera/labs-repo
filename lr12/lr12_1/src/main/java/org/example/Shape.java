package org.example;

public abstract class Shape {
    private String name;
    private int id;
    private double area;

    public Shape(String name, int id, double area) {
        this.name = name;
        this.id = id;
        this.area = area;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

    @Override
    public String toString() {
        return "name='" + name + "', id=" + id + ", area=" + area;
    }
}