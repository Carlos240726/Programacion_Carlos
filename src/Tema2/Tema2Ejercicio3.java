package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Dame la base de un triangulo");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();

        System.out.println("Dame la altura de un triangulo");
        int altura = in.nextInt();

        int area = (altura * base) / 2;
        int perimetro = base * 3;

        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
    }
}