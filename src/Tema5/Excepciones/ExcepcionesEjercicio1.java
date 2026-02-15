package Tema5.Excepciones;

import java.util.*;

public class ExcepcionesEjercicio1 {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        int valor;
        try {
            System.out.println("Introduce un valor entero");
            valor= in.nextInt();
            System.err.println("Valor introducido");
        }catch (InputMismatchException ex){
            System.err.println("Valor introducido incorrecto");
        }
    }
}
