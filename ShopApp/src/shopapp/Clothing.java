package shopapp;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Daniel Bermeo
 */
public class Clothing implements Comparable<Clothing> {

    private String description;
    private String size = "M";
    private double price;

    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        if (price > MIN_PRICE)
        {
            this.price = price;
        } else
        {
            this.price = MIN_PRICE;
        }
    }

    @Override
    public String toString() {
        return description + ", " + price + ", " + size;
    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }

}
