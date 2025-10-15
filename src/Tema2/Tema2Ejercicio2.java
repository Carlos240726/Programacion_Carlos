package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {

    public static void main (String[] args){

        System.out.println("Dame la base de un rectangulo");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();

        System.out.println("Dame la altura de un rectangulo");
        int altura = in.nextInt();

        int area = altura * base;
        int perimetro = 2*(base + altura);

        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
    }
}
