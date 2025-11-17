package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static int Multiplicar(int numero){
        int contador = 0;
        int resul = 0;
        while (contador <= 10){
            resul=contador*numero;
            System.out.println(numero + "*" + contador + "=" + resul);
            contador++;
        }
        return resul;
    }

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un numero del 1 al 10");
        int numero = in.nextInt();
        while (numero<1 || numero>10){
            System.out.println("ese numero no es posible");
        }
        Multiplicar(numero);
    }
}