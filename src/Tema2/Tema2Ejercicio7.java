package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main (String[] args){

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("Dame otro numero");
        int num2 = in.nextInt();
        int resul;

        if (num1 > num2) {
            resul = num1-num2;
            System.out.println("Es mayor " + num1 + " ,la resta es " + resul);
        }else if (num1 < num2){
            resul = num2 - num1;
            System.out.println("Es mayor " + num2 +  " ,la resta es " + resul);
        }else {
            System.out.println("Son iguales");
        }
    }
}

