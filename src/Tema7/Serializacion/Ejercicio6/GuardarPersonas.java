package Tema7.Serializacion.Ejercicio6;

import Tema7.Serializacion.Ejercicio6.Persona;

import java.io.*;
import java.util.ArrayList;

public class GuardarPersonas {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Ana García",   30));
        lista.add(new Persona("Luis Martínez",25));
        lista.add(new Persona("Carmen López", 42));
        lista.add(new Persona("Pedro Ruiz",   19));

        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("personas.dat"))) {

            oos.writeObject(lista);
            System.out.println("Lista guardada correctamente en personas.dat");
            System.out.println("Personas almacenadas: " + lista.size());

        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }
}
