package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {

    public static void main (String[] args){

        System.out.println("Dame una cantidad de dolares");
        Scanner in = new Scanner(System.in);
        int dolar = in.nextInt();
        double cambio = 0.83;
        double resul = dolar * cambio;
        System.out.println("El cambio a euros es " + resul);
    }
}

