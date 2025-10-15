package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num1 = in.nextInt();

        System.out.println("Dame otro número");
        int num2 = in.nextInt();

        System.out.println("Dame un último número");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else if (num1 > num3){
                System.out.println(num1 + " > " + num3 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            }
        } else if (num2 > num3) {
            if (num3 > num1) {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            } else {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            }
        } else {
            System.out.println(num3 + " > " + num2 + " > " + num1);
        }
    }
}
