package org.example;

public class Manager implements Workable, Promotable{
    private String name;
    private double salary;
    private String position;
    private int teamSize;

    public Manager(String name, double salary, String position, int teamSize) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.teamSize = teamSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " управляет командой из " + teamSize + " человек.");
    }

    @Override
    public void promote() {
        this.position = "Старший менеджер";
        this.salary *= 1.2;
        System.out.println(name + " повышен до должности: " + position + ". Новая зарплата: " + salary);
    }

    @Override
    public String toString() {
        return "Manager name='" + name + "', salary=" + salary +
                ", position='" + position + "', teamSize=" + teamSize;
    }
}
