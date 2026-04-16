package Tema7.Ejercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ordena_Archivos {

    public static void vaciarArchivo(String ruta) {
        try (FileWriter fw = new FileWriter(ruta, false)) {
        } catch (IOException e) {
            System.err.println("Error al vaciar el archivo: " + e.getMessage());
        }
    }
    public static void menu(){
        System.out.println("1. alumnos_notas");
        System.out.println("2. diccionario");
        System.out.println("3. frases");
        System.out.println("4. numeros");
        System.out.println("5. pi-millon");
        System.out.println("6. usa_apellidos");
        System.out.println("7. usa_nombres");
        System.out.println("8. usa_personas");
        System.out.println("Que archivo quieres ordenar?");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        menu();
        int opcion = in.nextInt();
        String rutaOpcion="";
        String rutaDestino ="src/Tema7/Ejercicio3/Archivo Ordenado.txt";
        String line="";
        List<String> lista = new ArrayList<>();
        switch (opcion){
            case 1:
                rutaOpcion="src/Tema7/Ejercicio3/alumnos_notas.txt";
                break;
            case 2:
                rutaOpcion="src/Tema7/Ejercicio3/diccionario.txt";
                break;
            case 3:
                rutaOpcion="src/Tema7/Ejercicio3/frases.txt";
                break;
            case 4:
                rutaOpcion="src/Tema7/Ejercicio3/numeros.txt";
                break;
            case 5:
                rutaOpcion="src/Tema7/Ejercicio3/pi-million.txt";
                break;
            case 6:
                rutaOpcion="src/Tema7/Ejercicio3/usa_apellidos.txt";
                break;
            case 7:
                rutaOpcion="src/Tema7/Ejercicio3/usa_nombres.txt";
                break;
            case 8:
                rutaOpcion="src/Tema7/Ejercicio3/usa_personas.txt";
                break;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(rutaOpcion))){
            while ((line = br.readLine()) != null){
                lista.add(line);
            }
            Collections.sort(lista);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        vaciarArchivo(rutaDestino);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino))){
            String[] lineas = lista.toArray(new String[0]);
            for (int i = 0;i<lineas.length;i++){
                bw.write(lineas[i]);
                bw.newLine();
            }
            //mostrar el archivo ordenado
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
