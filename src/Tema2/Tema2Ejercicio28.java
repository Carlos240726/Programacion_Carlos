package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main (String[] args){
        Random random = new Random();
        int numero = random.nextInt(100000);

        System.out.println("Cual es tu numero de la loteria");
        int contador = 0;

        while (contador <= 5){
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            contador++;

            if (num == numero){
                System.out.println("Has ganado");
                break;

            }else{
                System.out.println("Te quedan " + (5-contador) + " intentos");
            }
        }
    }
}
