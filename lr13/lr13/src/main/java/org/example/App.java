package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        List<Employee> staff = new ArrayList<>();

        System.out.println("Формирование штата");
        addEmployee(staff, "Иванов Иван", "Junior Developer", 800, "IT");
        addEmployee(staff, "Петрова Анна", "HR Manager", 1200, "HR");
        addEmployee(staff, "Сидоров Олег", "Accountant", 1000, "Finance");

        // Некорректные данные
        addEmployee(staff, "", "Tester", 900, "IT");            // пустое имя
        addEmployee(staff, "Козлов Пётр", "Tester", -500, "IT"); // зарплата <= 0
        addEmployee(staff, "Смирнов Лев", "Tester", 900, "");   // пустой отдел

        System.out.println("\nШтат после создания:");
        staff.forEach(System.out::println);

        System.out.println("\nПовышение ");
        Employee emp = staff.get(0);
        try {
            emp.promote("Middle Developer", 1500);
            System.out.println("Повышение успешно: " + emp);
        } catch (PromotionException e) {
            System.out.println("Ошибка повышения: " + e.getMessage());
        }

        try {
            emp.promote("Senior Developer", 1400);
        } catch (PromotionException e) {
            System.out.println("Ошибка повышения: " + e.getMessage());
        }

        System.out.println("\n Перевод ");
        try {
            emp.changeDepartment("Sales");
            System.out.println("Перевод успешно: " + emp);
        } catch (DepartmentNotFoundException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());
        }

        try {
            emp.changeDepartment("");
        } catch (DepartmentNotFoundException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());
        }

        System.out.println("\nИтоговый штат:");
        staff.forEach(System.out::println);
    }

    private static void addEmployee(List<Employee> staff, String name, String position,
                                    double salary, String department) {
        try {
            Employee e = new Employee(name, position, salary, department);
            staff.add(e);
            System.out.println("Добавлен: " + e);
        } catch (InvalidSalaryException e) {
            System.out.println("Некорректные данные сотрудника '" + name + "': " + e.getMessage());
        } catch (DepartmentNotFoundException e) {
            System.out.println("Не удалось добавить '" + name + "': " + e.getMessage());
        }
    }
}

