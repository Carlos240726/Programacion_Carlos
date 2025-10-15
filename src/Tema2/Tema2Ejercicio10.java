package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {

        System.out.println("Dame un numero");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("Dame otro numero");
        int num2 = in.nextInt();

        System.out.println("Dame un ultimo numero");
        int num3 = in.nextInt();

        if (num1>num2){
            if(num2>num3){
                System.out.println("Estan ordenados de mayor a menor");
            }else{
                System.out.println("No estan ordenados");
            }
        }else if(num3>num2){
                System.out.println("Estan ordenados de menor a mayor");
        }else{
            System.out.println("No estan ordenados");
        }
    }
}