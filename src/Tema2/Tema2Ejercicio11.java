package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("Dame otro numero");
        int num2 = in.nextInt();

        System.out.println("Dame un ultimo numero");
        int num3 = in.nextInt();

        if (num2 - 1 == num1) {
            if (num3 - 1 == num2) {
                System.out.println("Son consecutivos");
            }else {
                System.out.println("No son consecutivos");
            }
        }else{
            System.out.println("No son consecutivos");
        }
    }
}