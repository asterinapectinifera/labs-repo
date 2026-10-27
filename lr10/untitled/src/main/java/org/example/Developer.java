package org.example;

public class Developer implements Workable, Promotable{
    private String name;
    private double salary;
    private String position;
    private String language;

    public Developer(String name, double salary, String position, String language) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.language = language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(name + " пишет код на " + language + ".");
    }

    @Override
    public void promote() {
        this.position = "Ведущий разработчик";
        this.salary *= 1.3;
        System.out.println(name + " повышен до должности: " + position + ". Новая зарплата: " + salary);
    }

    @Override
    public String toString() {
        return "Developer name='" + name + "', salary=" + salary +
                ", position='" + position + "', language='" + language;
    }
}
