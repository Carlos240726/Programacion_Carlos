package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args){

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Dame un numero");
        int num2 = in.nextInt();

        while (num1 < num2){
            if (num1%2==1){
                System.out.println(num1);
            }
            num1++;
        }
    }
}
