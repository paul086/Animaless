/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import Animaless.Gato;
import Animaless.Perro;

/**
 *
 * @author pablcastro
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato Tom = new Gato("Pablo", "Azul", 3);
        System.out.println(Tom);
        Tom.setColor("Verde");
        System.out.println(Tom.getColor());
        
        Perro Pluto = new Perro("Pluto", "Marron", 5);
        System.out.println(Pluto);
        Pluto.setColor("Negro");
        System.out.println(Pluto.getColor());
        
    }
    
}
