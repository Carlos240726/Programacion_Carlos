package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main (String[] args){

        System.out.println("Dame una cara del dado");
        Scanner in = new Scanner(System.in);
        int cara = in.nextInt();
        while(cara > 6 || cara < 1){
            cara = in.nextInt();
            if (cara > 6 || cara < 1){
                System.out.println("Eso no me sirve");}
        }
        int cruz;
        cruz = 7 - cara;
        System.out.println("Su contrario es " + cruz);
    }
}
