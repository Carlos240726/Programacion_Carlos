package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime el número del cual quieres la raíz cuadrada)");
        int raiz = in.nextInt();

        if (raiz >= 0) {
            double total = Math.sqrt(raiz);
            System.out.println("La raiz cuadrada de " + raiz + " = " + total);
        } else {
            System.out.println("No se pueden negativos");
        }
    }
}
