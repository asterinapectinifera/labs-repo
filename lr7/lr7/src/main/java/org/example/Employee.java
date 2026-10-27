package org.example;

public class Employee {

    private String fullName;
    private String position;
    private double salary;


    private static int totalEmployees = 0;
    private static double totalSalary = 0;

    public static void test(){
        System.out.println(" " + totalEmployees + " " + totalSalary);
    }

    public Employee(String fullName, String position, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        totalEmployees++;
        totalSalary += salary;
    }


    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double getTotalSalary() {
        return totalSalary;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        totalSalary -= this.salary;
        this.salary = salary;
        totalSalary += salary;
    }

    public static double getAverageSalary() {
        if (totalEmployees == 0) return 0;
        return totalSalary / totalEmployees;
    }

    public static void printTotalStatistics() {

        System.out.println("Всего сотрудников: " + totalEmployees);
        System.out.println("Общая сумма зарплат: " + totalSalary);
        System.out.println("Средняя зарплата: " + getAverageSalary());
    }


    @Override
    public String toString() {
        return "Сотрудник" + " ФИО='" + fullName + ' ' + ", должность='" + position + ' ' + ", зарплата=" + salary;
    }
}
