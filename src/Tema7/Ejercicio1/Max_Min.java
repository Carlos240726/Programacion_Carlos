package Tema7.Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Max_Min {
    public static void main(String[] args){
        String fileName = "/media/cargarrom7/Ventoy/Programacion_Carlos/src/Tema7/Ejercicio1/numeros.txt";
        int maximo=0;
        int minimo=99999999;
        String line;
        try (BufferedReader br = new BufferedReader (new FileReader(fileName))){
            while ((line = br.readLine()) !=null){

                if (maximo<Integer.parseInt(line)){
                    maximo=Integer.parseInt(line);
                }
                if (minimo>Integer.parseInt(line)){
                    minimo=Integer.parseInt(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(maximo);
        System.out.println(minimo);
    }
}
