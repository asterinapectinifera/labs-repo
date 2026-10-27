package org.example;

public class Fish extends Animal {
    private String habitat;

    public Fish(String name, int age, double weight, String habitat) {
        super(name, age, weight);
        this.habitat = habitat;
    }

    @Override
    public String move() {
        return "Плавает";
    }

    public String makeSound(int volume) {
        return "Буль-буль громкостью " + volume;
    }

    public String getHabitat() { return habitat; }
}