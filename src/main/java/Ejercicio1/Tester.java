/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Daniel Bermeo
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Toy toy = new ChewToy();
        myDog.fetch(toy);
        toy = new SqueakyToy();
        myDog.fetch(toy);
    }
    
}
