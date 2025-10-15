package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Dame un numero");
        int num2 = in.nextInt();
        if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }else {
            System.out.println(num1 + " es igual que " + num2);
        }
    }
}
