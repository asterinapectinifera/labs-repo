package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Shape> shapes = new HashMap<>();

        shapes.put("Circle1", new Circle("Circle1", 1, 78.5, 5.0));
        shapes.put("Circle2", new Circle("Circle2", 2, 28.26, 3.0));
        shapes.put("Circle3", new Circle("Circle3", 3, 12.56, 2.0));

        shapes.put("Rect1", new Rectangle("Rect1", 4, 20.0, 5.0, 4.0));
        shapes.put("Rect2", new Rectangle("Rect2", 5, 30.0, 6.0, 5.0));
        shapes.put("Rect3", new Rectangle("Rect3", 6, 15.0, 3.0, 5.0));

        shapes.put("Tri1", new Triangle("Tri1", 7, 10.0, 5.0, 4.0));
        shapes.put("Tri2", new Triangle("Tri2", 8, 12.0, 6.0, 4.0));

        System.out.println("Все фигуры");
        for (String key : shapes.keySet()) {
            System.out.println("Ключ: " + key + "    Значение: " + shapes.get(key));
        }
    }
}
