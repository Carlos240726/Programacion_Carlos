package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {

    public static int Primos(int numero){
        int contador = 0;
        int divisor = numero;
        while (divisor>0){
            int operacion =numero%divisor;
            divisor--;
            if(operacion==0){
                contador++;
            }
        }
        if (contador>2){
            System.out.println("El numero no es primo");
        }else if (contador<=2){
            System.out.println("El numero es primo");
        }
        return contador;
    }

    public static void main (String[] args){
        Scanner in =new Scanner(System.in);
        boolean verificacion=true;
        int numero;
        while (verificacion==true){
            System.out.println("Dame un numero y te dire si es primo o no, si pones 0 se acaba");
            numero = in.nextInt();
            while (numero<0){
                System.out.println("Eso no es posible, introduzca un nuevo numero");
                numero = in.nextInt();
            }
            if (numero==0){
                verificacion=false;
            }
            Primos(numero);
        }
    }
}
