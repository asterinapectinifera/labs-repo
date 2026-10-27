package org.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public String move() {
        return "Бегает";
    }

    @Override
    public String makeSound() {
        return "Гав-гав";
    }

    public String makeSound(int volume, String command) {
        return "Гав-гав громкостью " + volume + " по команде " + command;
    }

    public String getBreed() {
        return breed;
    }
}