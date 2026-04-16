package Tema7.Serializacion.Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ruta = "src/Tema7/Serializacion/Ejercicio1/usuario.txt";
        String nombre;
        int edad;

        System.out.println("Dime tu nombre");
        nombre = in.nextLine();
        System.out.println("Dime tu edad");
        edad = in.nextInt();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            bw.write("Nombre: "+ nombre);
            bw.newLine();
            bw.write("Edad: "+ edad);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
