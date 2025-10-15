package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Dame un numero");
        int num2 = in.nextInt();

        int resul = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resul);

        resul = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resul);

        resul = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resul);

        resul = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resul);    }
}

