package Animaless;

public class Leon {

    public String nombre;
    public String color;
    public int edad;

    public Leon() {
    }

    public Leon(String nombre, String color, int edad) {
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
        return "Leon{" + "Nombre " + nombre + ", Color " + color + ", Edad " + edad + '}';
    }

}
