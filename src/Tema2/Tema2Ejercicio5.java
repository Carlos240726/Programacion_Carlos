package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {

    public static void main (String[] args){

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("Dame otro numero");
        int num2 = in.nextInt();

        System.out.println("Dame un ultimo numero");
        int num3 = in.nextInt();

        double total = num1 + num2 + num3;
        int sindec = (num1 + num2 + num3)/3;
        double condec = total/3;

        System.out.println("Media sin decimales = " + sindec);
        System.out.println("Media con decimales = " + condec);
    }
}

