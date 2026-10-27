package org.example;

public class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String makeSound() {
        return "Издает звук";
    }

    public String makeSound(int volume) {
        return "Издает звук громкостью " + volume;
    }

    public String makeSound(String mood) {
        return "Издает " + mood + " звук";
    }

    public String move() {
        return "Животное двигается";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}