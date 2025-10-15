package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main (String[] args){

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        if (num1 > 0) {
            System.out.println("Es positivo");
        }else if (num1 < 0){
            System.out.println("Es negativo");
        }else {
            System.out.println("Es neutro");
        }
    }
}