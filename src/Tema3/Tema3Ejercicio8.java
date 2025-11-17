package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {

    public static boolean fecha(int dia, int mes, int year){

        if (mes == 1|| mes == 3|| mes ==5||mes==7||mes==8||mes==10||mes==12){
            System.out.println("Es correcta");
        } else if (mes ==4||mes==6 || mes == 9 ||mes==11) {
            if (dia <= 30){
                System.out.println("Es correcta");
            } else {
                System.out.println("Es incorrecta");
            }
        }else if (mes == 2 ){
            int contador = year%4;
            if (dia <= 28){
                System.out.println("Es correcta");
            }else if (dia <= 29 && contador==0 ){
                System.out.println("Es correcto");
            }else {
                System.out.println("Es incorrecta");
            }
        }
        return true;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un dia (1-31)");
        int dia = in.nextInt();

        while (dia < 1 || dia > 31){
            dia = in.nextInt();
        }

        System.out.println("Dame un mes (1-12)");
        int mes = in.nextInt();

        while (mes < 1 || mes > 12){
            mes = in.nextInt();
        }
        System.out.println("Dame un año");
        int year = in.nextInt();

        fecha(dia, mes, year);

    }
}
