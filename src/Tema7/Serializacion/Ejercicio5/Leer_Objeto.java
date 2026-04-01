package Tema7.Serializacion.Ejercicio5;

import Tema7.Serializacion.Ejercicio4.Persona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leer_Objeto {
    public static void main(String[] args){
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("persona.dat"))) {

            Persona leida = (Persona) ois.readObject();
            System.out.println("Objeto leído:    " + leida);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
