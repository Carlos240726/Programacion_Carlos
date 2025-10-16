package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main (String[] args){
        System.out.println("Dame un numero y te dare el factorial");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int contador = numero;
        int factorial = 1;
        while (contador > 0){
             factorial = factorial * contador;
             contador--;
        }
        System.out.println("El factorial de " + numero +  " = " + factorial);
    }
}
