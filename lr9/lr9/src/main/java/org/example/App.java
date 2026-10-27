package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Food food = new Food("Еда", 100, 50.0);
        Food[] menu = new Food[5];

        menu[0] = new Pizza("Маргарита", 250, 450.0, "Сыр, томаты");
        menu[1] = new Pizza("Пепперони", 320, 550.0, "Пепперони, сыр");
        menu[2] = new Pizza("Гавайская", 280, 520.0, "Курица, ананас");

        menu[3] = new Salad("Цезарь", 180, 320.0, "Майонез");
        menu[4] = new Salad("Греческий", 120, 280.0, "Оливковое масло");

        for (int i = 0; i < menu.length; i++) {
            menu[i].displayInfo();
            System.out.println();
        }

        Pizza f1 = new Pizza("4 сыра", 400, 600.0, "4 вида сыра");
        Salad f2 = new Salad("Витаминный", 90, 200.0, "Сметана");
        System.out.println("\nПолиморфизм: f1.cook() " + f1.cook());
        System.out.println("Полиморфизм: f2.cook() " + f2.cook());
    }
}
