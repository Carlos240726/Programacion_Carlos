package Tema7.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Phaser;

public class Notas_Alumnos {
    public static void main(String[] args){
        String fileName = "/media/cargarrom7/Ventoy/Programacion_Carlos/src/Tema7/Ejercicio2/alumnos_notas.txt";
        String line;
        String nombre="";
        String apellido="";
        double media=0;
        int contador=0;
        int orden = 0;

        Map<Double,String> alumnado = new TreeMap<>(Collections.reverseOrder());

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while ((line = br.readLine()) != null){
                contador=0;
                String[] alumno = line.split(" ");
                nombre = alumno[0];
                apellido = alumno[1];
                for (int i = 2; i<alumno.length;i++){
                    String valor = alumno[i];
                    media=media+Integer.parseInt(valor);
                    contador++;
                }
                media=media/contador;
                String persona = nombre + " " + apellido;
                alumnado.put(media,persona);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println(alumnado);
    }
}
