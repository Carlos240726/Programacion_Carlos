package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void piramide(char caracter, int escalones){

        String piramide = "";
        int vacio=0;
        int bucle = 0;
        while (escalones>0){
            vacio=escalones-1;
            while (vacio>0){
            piramide = piramide + " ";
            vacio--;
        }
        vacio = escalones - (escalones - 1) + bucle;
        while (vacio>0){
            piramide=piramide + caracter;
            vacio--;
        }
            System.out.println(piramide);
            escalones--;
            piramide = "";
            bucle = bucle+2;
        }
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Dame un caracter para la piramide");
        char caracter = in.next().charAt(0);
        System.out.println("Dime cuantos escalones quieres");
        int escalones = in.nextInt();

        piramide(caracter,escalones);

    }
}
