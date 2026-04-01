package Tema7.Serializacion.Ejercicio6;

import java.io.*;
import java.util.ArrayList;

public class LeerPersonas {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {

            ArrayList<Persona> lista = (ArrayList<Persona>) ois.readObject();

            System.out.println("=== Personas almacenadas (" + lista.size() + ") ===");
            for (int i = 0; i < lista.size(); i++) {
                Persona p = lista.get(i);
                System.out.printf("%d. Nombre: %-20s | Edad: %d%n",
                        i + 1, p.getNombre(), p.getEdad());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado. Ejecuta primero GuardarPersonas.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
