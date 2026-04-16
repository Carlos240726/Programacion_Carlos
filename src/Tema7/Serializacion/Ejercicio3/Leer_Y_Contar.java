package Tema7.Serializacion.Ejercicio3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_Y_Contar {
    public  static void main(String[] args) {
        String ruta = "src/Tema7/Serializacion/Ejercicio3/texto.txt";
        String linea;
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while ((linea = br.readLine()) != null) {
                if (!linea.isBlank()) {
                    String[] palabras = linea.toLowerCase().trim().split("\\s+");
                    contador += palabras.length;
                }
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println("La cantidad de palabras es: " + contador);
    }
}
