package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuántas personas?");
        int personas = in.nextInt();

        System.out.println("¿Cuántos días?");
        int dias = in.nextInt();

        if (personas > 5 && dias >= 7 ) {
            double desc = (personas * 15 * dias) * 25 / 100;
            double total = (personas * 15 * dias) - desc;
            System.out.println("El total a pagar es de " + total);
        } else {
            double total = (personas * 15 * dias);
            System.out.println("El total a pagar es de " + total);
        }
    }
}
