package Tema3;

import java.util.Scanner;


public class Tema3Ejercicio1 {
    public static int numberSing(int resultado){
        if(resultado > 0){
            return  1;
        }else if (resultado < 0){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un numero");
        int numero = in.nextInt();

        int resultado = numberSing(numero);

        switch (resultado){
            case 0:
                if (resultado==0) {
                    System.out.println("El numero recibido es 0");
                }
            case -1:
                if (resultado==-1){
                    System.out.println("El numero recibido es negativo");
                }
            case 1:
                if (resultado==1){
                    System.out.println("El numero recibido es positivo");
                }
        }
    }
}
