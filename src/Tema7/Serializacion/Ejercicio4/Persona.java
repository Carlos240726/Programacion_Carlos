package Tema7.Serializacion.Ejercicio4;
import java.io.*;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad()      { return edad; }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }

    public static void main(String[] args) {

        Persona p = new Persona("Manolo", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {

            oos.writeObject(p);
            System.out.println("Objeto guardado: " + p);

        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }

    }
}
