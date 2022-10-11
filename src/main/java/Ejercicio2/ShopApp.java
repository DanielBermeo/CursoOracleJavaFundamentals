/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Ejercicio3.Customer;
import Ejercicio4.Clothing;
import java.util.Arrays;

/**
 *
 * @author Daniel Bermeo
 */
public class ShopApp {

    public static void main(String[] args) {
        double tax;
        // Ejercicio 2
        System.out.println("Welcome to duke shop app");

        //Ejercicio 3
        Customer c1 = new Customer("Pinky", 3);
//        c1.setName("Pinky");
        c1.setSize("S");

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items =
        {
            item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")
        };

        System.out.println("Minimum Price: " + Clothing.MIN_PRICE);

//        item1.setDescription();
//        item1.setPrice();
//
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//        
//        items[2].setDescription("Green Scarf");
//        items[2].setPrice(5.0);
//        items[2].setSize("S");
//
//        items[3].setDescription("Blue T-Shirt");
//        items[3].setPrice(10.5);
//        items[3].setSize("S");
//        System.out.println("Item 1: " + item1.description+ " "+item1.price+" "+item1.size);
//        System.out.println("Item 2: " + item2.description+ " "+item2.price+" "+item2.size);
        tax = 0.2; // represent 20%

        double total = 0.0;
        //total = (item1.price+(item2.price*2))*(1+tax);

        // Ejercicio 4
        int measurement = 3;
        c1.setSize(measurement);
        c1.addItems(items);
        System.out.println("Customer is " + c1.getName() + " , " + c1.getSize());

        for (Clothing item : items)
        {
            System.out.println("Item: " + item);
        }

        System.out.println("The total is: " + c1.getTotalClothingCost());

        int average = 0, count = 0;

        for (Clothing item : c1.getItems())
        {
            if (item.getSize().equals("L"))
            {
                count++;
                average += item.getPrice();
            }

        }

        try
        {
            average = average / count;
            System.out.println("Average price " + average + ", count " + count);
        } catch (ArithmeticException exep)
        {
            System.out.println("Don´t divide by zero");
        }
        
        Arrays.sort(c1.getItems());
        for (Clothing item : items)
        {
            System.out.println("Item: " + item);
        }
    }

}
