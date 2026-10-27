package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, int id, double area, double radius) {
        super(name, id, area);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public String toString() {
        return super.toString() + " Circle radius=" + radius;
    }
}