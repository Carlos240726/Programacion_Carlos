package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static int multiplicar(int numero){
        int resul = 0;
        //TODO:for
        for( int i =0;i<= 10;i++){
            resul=i*numero;
            System.out.println(numero + "*" + i + "=" + resul);
        }
        return resul;
    }

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un numero del 1 al 10");
        int numero = in.nextInt();
        while (numero<1 || numero>10){
            System.out.println("ese numero no es posible");
            numero = in.nextInt();
        }
        multiplicar(numero);
    }
}