package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main (String[] args){

        System.out.println("Dame la longitud de un lado de un cuadrado");
        Scanner in = new Scanner(System.in);
        int lado = in.nextInt();

        int area = lado * lado;
        int perimetro = lado * 4;

        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
    }
}
