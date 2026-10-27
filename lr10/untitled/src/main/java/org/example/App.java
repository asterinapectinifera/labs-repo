package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Workable[] workers = new Workable[5];
        Promotable[] promotables = new Promotable[5];

        Manager manager1 = new Manager("Алексей Иванов", 5000, "Менеджер", 5);
        Manager manager2 = new Manager("Мария Петрова", 5500, "Менеджер", 8);

        Developer dev1 = new Developer("Иван Сидоров", 4000, "Разработчик", "Java");
        Developer dev2 = new Developer("Елена Козлова", 4200, "Разработчик", "Python");
        Developer dev3 = new Developer("Дмитрий Смирнов", 3800, "Разработчик", "C++");

        workers[0] = manager1;
        workers[1] = manager2;
        workers[2] = dev1;
        workers[3] = dev2;
        workers[4] = dev3;

        promotables[0] = manager1;
        promotables[1] = manager2;
        promotables[2] = dev1;
        promotables[3] = dev2;
        promotables[4] = dev3;

        System.out.println("Сотрудники до повышения");
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }

        System.out.println("Повышение сотрудников");
        for (int i = 0; i < promotables.length; i++) {
            promotables[i].promote();
        }

        System.out.println("Информация о сотрудниках после повышения");
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
        //Workable.printWorkInfo(workers.get(0));

    }
}
