package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main (String[] args){
        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int contador = 0;
        while (num > 0){
            num = num/10;
            contador++;
        }
        System.out.println("El numero de cifras es " + contador);
    }
}
