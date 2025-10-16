package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main (String[] args){
        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int contador = 0;
        int total = 0;
        while (num > 0){
            total = total + num;
            contador++;
            num = in.nextInt();
        }
        double media = total/contador;
        System.out.println("La media es de " + media);
    }
}
