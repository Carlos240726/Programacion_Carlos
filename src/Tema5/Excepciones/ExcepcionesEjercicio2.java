package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesEjercicio2 {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        int num1;
        int num2;
        try {
            System.out.println("Introduce un valor entero para el primer dato");
            num1= in.nextInt();
            System.out.println("Valor introducido");

            System.out.println("Introduce un valor entero para el segundo dato");
            num2= in.nextInt();
            System.out.println("Valor introducido");

            int resultado= num1/num2;
        }catch (InputMismatchException incoincidente){
            System.err.println("Uno  o varios de los valores introducidos es incorrecto");
        }catch (ArithmeticException aritmetica){
            System.err.println("Error aritmetico");
        }
    }
}
