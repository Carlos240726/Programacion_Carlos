package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main (String[] args){
        Random random = new Random();
        int numero = random.nextInt(100);
        Scanner in = new Scanner(System.in);

        System.out.println("Cual es tu numero");
        int contador = 0;

        while (contador <= 5){
            int num = in.nextInt();

            if (num == numero){
                System.out.println("Has ganado");
                break;

            }else{

                if (numero > num){
                    System.out.println("El numero es mayor que " + num);

                }else{
                    System.out.println("El numero es menor que " + num);
                }
            }
        }
    }
}
