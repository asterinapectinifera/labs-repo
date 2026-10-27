package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иванов Иван Иванович", "Менеджер", 50000);
        Employee e2 = new Employee("Петрова Анна Сергеевна", "Бухгалтер", 60000);
        Employee e3 = new Employee("Сидоров Пётр Алексеевич", "Программист", 90000);
        Employee e4 = new Employee("Кузнецова Мария Ивановна", "Дизайнер", 70000);
        Employee e5 = new Employee("Смирнов Олег Викторович", "Директор", 120000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        Employee.printTotalStatistics();

    }
}
