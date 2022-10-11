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
public class Dog {

    private String name;
    private int weight;
    private Toy favoriteToy;
    private Toy myToy;
    
    public String getName(){
        return this.name;
    }
    
    public void fetch(Toy toy){
        toy.play();
        makeFavoriteToy(toy);
    }
    public void makeFavoriteToy(Toy favoriteToy){
        this.favoriteToy = favoriteToy;
    }
}
