package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        float num1 = in.nextInt();
        System.out.println("Dame un numero");
        float num2 = in.nextInt();

        float resul = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resul);

        resul = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resul);

        resul = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resul);

        resul = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + resul);    }
}
