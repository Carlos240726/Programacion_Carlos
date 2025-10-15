package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main (String[] args){

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        double a = 3.14 * r * r;
        System.out.println("Su area si fuera un circulo seria " + a );
    }
}
