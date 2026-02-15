package Tema5.Excepciones;

import java.util.*;

public class ExcepcionesEjercicio3 {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        double[] vector=new double[5];
        int continuar=0;
        try {
            for (int i =0; i<vector.length;i++){
                System.out.println("Introduce un valor");
                vector[i]=in.nextDouble();
                System.out.println("Valor introducido");
            }
        }catch (InputMismatchException incoincidente){
            System.err.println("Uno  o varios de los valores introducidos es incorrecto");
        }
    }
}
