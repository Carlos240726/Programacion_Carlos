package Tema7.Ejercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Crear_Nombres {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String rutaNombres = "src/Tema7/Ejercicio4/usa_nombres.txt";
        String rutaApellidos = "src/Tema7/Ejercicio4/usa_apellidos.txt";
        String rutaNombreCreado = "src/Tema7/Ejercicio4/usa_personas.txt";
        String line;
        String nombreCompleto="";
        List<String> listaNombres = new ArrayList<>();
        List<String> listaApellidos = new ArrayList<>();
        List<String> listaNombresCompletos = new ArrayList<>();
        int contador = 0;

        System.out.println("Cuantos nombres quieres crear");
        int cantidad=in.nextInt();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaNombres))){
            while ((line = br.readLine()) != null){
                listaNombres.add(line);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(rutaApellidos))){
            while ((line = br.readLine()) != null){
                listaApellidos.add(line);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        Random random = new Random();
        Random random2 = new Random();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaNombreCreado, true))){

            for (int i = 0;i<cantidad;i++) {
                int posicion=random.nextInt(listaNombres.size());
                int posicion2=random2.nextInt(listaApellidos.size());
                nombreCompleto = listaNombres.get(posicion) + " " + listaApellidos.get(posicion2);
                bw.write(nombreCompleto);
                bw.newLine();
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
