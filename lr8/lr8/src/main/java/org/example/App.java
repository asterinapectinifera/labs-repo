package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product[] products = new Product[5];

        products[0] = new Electronics("Ноутбук", 1200.0, 2.5, 24);
        products[1] = new Electronics("Смартфон", 800.0, 0.3, 12);
        products[2] = new Electronics("Телевизор", 1500.0, 15.0, 36);

        products[3] = new Food("Молоко", 2.5, 1.0, "2026-10-15");
        products[4] = new Food("Хлеб", 1.8, 0.5, "2026-10-05");
        Product product = new Electronics("Ноутбук", 1200.0, 2.5, 24);
        Electronics electronics = new Electronics("Ноутбук", 1200.0, 2.5, 24);
        //product.print();

        for (int i = 0; i < products.length; i++) {
            System.out.println(" ");
            products[i].displayInfo();

            if (products[i] instanceof Electronics) {
                Electronics e = (Electronics) products[i];
                e.checkWarranty();
            }
            if (products[i] instanceof Food) {
                Food f = (Food) products[i];
                f.isExpired();
            }
        }

    }
}
