package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main (String[] args){
        System.out.println("Dame un numero y te dire si es primo o no");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int contador = numero;
        int divisor = 1;
        int valor = 0;
        while (contador > 0){
            if (numero % divisor == 0){
                valor++;
            }
            contador--;
            divisor++;
        }
        if (valor > 2){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero es primo");
        }
    }
}
