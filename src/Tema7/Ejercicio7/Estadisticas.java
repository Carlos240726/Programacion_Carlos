package Tema7.Ejercicio7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Estadisticas {
    public static void main(String[] args) {
        String ruta = "src/Tema7/Ejercicio7/Libros/quijote_cervantes.txt";
        String linea;
        int contador_lineas = 0;
        int contador_palabras = 0;
        int contador_caracteres = 0;
        Map<String, Integer> comunes = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while ((linea = br.readLine()) != null) {
                contador_lineas++;
                contador_caracteres += linea.length();

                if (!linea.isBlank()) {
                    String[] palabras = linea.toLowerCase().trim().split("\\s+");
                    contador_palabras += palabras.length;

                    for (String palabra : palabras) {
                        comunes.put(palabra, comunes.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Atributos:");
        System.out.println("Lineas: " + contador_lineas);
        System.out.println("Palabras: " + contador_palabras);
        System.out.println("Caracteres: " + contador_caracteres);
        System.out.println("\nTop 10 palabras más comunes:");
        comunes.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue() + " veces"));
    }
}