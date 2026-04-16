package Tema7.Serializacion.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static void main(String[] args){
        String ruta = "src/Tema7/Serializacion/Ejercicio1/usuario.txt";
        String linea="";

        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
