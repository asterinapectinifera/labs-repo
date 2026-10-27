package org.example;

public interface Workable {
    int t = 5;
    void work();
    double getSalary();
    static void printWorkInfo(Workable worker) {
        System.out.println("Сотрудник работает. Зарплата: " + worker.getSalary());
    }
}
