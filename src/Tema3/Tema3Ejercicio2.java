package Tema3;

import java.util.Scanner;


public class Tema3Ejercicio2 {
    public static boolean isAdult(int age){
        if (age>= 18){
            return true;
        }else {
            return false;
        }
    }

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un numero");
        int numero = in.nextInt();

        int resultado = Tema3Ejercicio1.numberSing(numero);

        System.out.println(resultado);

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

        System.out.println("Dame otro numero");
        int edad = in.nextInt();
        boolean age = isAdult(edad);

        if (age==true){
            System.out.println("Es mayor de edad");
        }
        if (age==false){
            System.out.println("Es menor de edad");
        }
    }
}

