/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animaless;

/**
 *
 * @author Elio
 */
public class Perro {
        //Cada Clase debe tener atributos, Constructores y metodos.
     String nombre;
     String color;
     int edad;

    public Perro() {
    }

    public Perro(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre " + nombre + ", color=" + color + ", edad=" + edad + '}';
    }
     
}


