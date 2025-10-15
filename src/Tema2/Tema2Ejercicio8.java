package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {

    public static void main (String[] args){

        System.out.println("Dame una cantidad de euros");
        Scanner in = new Scanner(System.in);
        int euros = in.nextInt();
        double cambio = 1.17;
        double resul = euros * cambio;
        System.out.println("El cambio a dolares es " + resul);
    }
}
