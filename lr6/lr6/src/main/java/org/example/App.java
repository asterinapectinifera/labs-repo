package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Building building = new Building("ул. Ленина, д. 10", 5, 1500.0);
        Building building2 = new Building("ул. Ленина, д. 10", 5, 1500.0, 12);
        System.out.println("Средняя площадь этажа: " + building.averageAreaPerFloor());
    }
}
