package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("перегрузка");
        Animal base = new Animal("Зверь", 3, 10.5);
        System.out.println(base.makeSound());
        System.out.println(base.makeSound(50));
        System.out.println(base.makeSound("радостный"));
        System.out.println(base.move());

        Dog dog = new Dog("Бобик", 4, 12.0, "Лабрадор");
        System.out.println(dog.makeSound());
        System.out.println(dog.makeSound(80));
        System.out.println(dog.makeSound(80, "сидеть"));
        System.out.println(dog.move());

        Fish fish = new Fish("Немо", 2, 0.5, "Морская");
        System.out.println(fish.makeSound());
        System.out.println(fish.makeSound(20));
        System.out.println(fish.move());

        System.out.println("\n переопределение");
        Animal[] animals = {base, dog, fish};
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            System.out.println(a.getName() + "  move(): " + a.move()
                    + ", makeSound(): " + a.makeSound());
        }

        System.out.println("\n Сравнение статического и динамического полиморфизма ");
        System.out.println("Статический (перегрузка):");
        System.out.println("  base.makeSound(10)    " + base.makeSound(10));
        System.out.println("  dog.makeSound(10)     " + dog.makeSound(10));
        System.out.println("  dog.makeSound(10, лежать)  " + dog.makeSound(10, "лежать"));

        System.out.println("Динамический (переопределение):");
        Animal ref1 = new Dog("Шарик", 2, 8.0, "Дворняга");
        Animal ref2 = new Fish("Дори", 1, 0.3, "Речная");
        System.out.println("  ref1.move() " + ref1.move());
        System.out.println("  ref2.move() " + ref2.move());

        System.out.println("\n instanceof и нисходящее преобразование");
        for (Animal a : animals) {
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                System.out.println(a.getName() + "  это собака, порода: " + d.getBreed());
            } else if (a instanceof Fish) {
                Fish f = (Fish) a;
                System.out.println(a.getName() + "  это рыба, среда: " + f.getHabitat());
            } else {
                System.out.println(a.getName() + "  просто животное");
            }
        }
    }
}
