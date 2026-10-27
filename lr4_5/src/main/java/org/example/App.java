package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //1

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        System.out.println(f1 + " = " + f1.toDecimal());
        System.out.println(f2 + " = " + f2.toDecimal());

        //2

        Car[] cars = new Car[5];

        cars[0] = new Car("Toyota", 2020, 25000.0);
        cars[1] = new Car("BMW", 2021, 45000.0);
        cars[2] = new Car("Mercedes", 2019, 55000.0);
        cars[3] = new Car("Audi", 2022, 60000.0);
        cars[4] = new Car("Honda", 2018, 20000.0);
        Car mostExpensive = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = cars[i];
            }
        }

        Car oldest = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getYear() < oldest.getYear()) {
                oldest = cars[i];
            }
        }
        System.out.println("дорогая "+mostExpensive);
        System.out.println("старая "+oldest);

        //3

        User[] users = {
                new User("Иван", Role.ADMIN),
                new User("Мария", Role.USER),
                new User("Петр", Role.GUEST),
                new User("Ольга", Role.ADMIN),
                new User("Сергей", Role.USER)
        };


        System.out.println("администраторы");
        for (int i=0; i< users.length; i++) {
            if (users[i].getRole() == Role.ADMIN) {
                System.out.println(users[i].getName());
            }
        }
    }
}
