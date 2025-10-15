package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main (String[] args){
        
        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("Dame otro numero");
        int num2 = in.nextInt();

        System.out.println("Dame un ultimo numero");
        int num3 = in.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("El mayor es " + num1);
                
            }else {
                System.out.println("El mayor es " + num3);
            }
        }else {
            if (num2 > num3){
                System.out.println("El mayor es " + num2);
            }else {
                System.out.println("El mayor es " + num3);
            }
        }
    }
}
