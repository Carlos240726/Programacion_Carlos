package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Elige un mes");
        int mes = in.nextInt();

        if (mes > 12 || mes < 1) {
            System.out.println("Eso no es un mes");
        } else {
            System.out.println("Elige un año");
            int ano = in.nextInt();

            switch (mes) {

                case 1:
                    System.out.println("Este mes tiene 31 días");
                    break;
                case 2:
                    if (ano%400 == 0){
                        if (ano%100 == 0){
                            System.out.println("Este mes tiene 28 días");
                            break;
                        } else {
                            if (ano%4 == 0){
                                System.out.println("Este mes tiene 29 días");
                                break;
                            } else {
                                System.out.println("Este mes tiene 28 días");
                                break;
                            }
                        }
                    } else {
                        if (ano % 100 == 0) {
                            System.out.println("Este mes tiene 28 días");
                            break;
                        } else {
                            if (ano % 4 == 0) {
                                System.out.println("Este mes tiene 29 días");
                                break;
                            } else {
                                System.out.println("Este mes tiene 28 días");
                                break;
                            }
                        }
                        }
                    case 3:
                        System.out.println("Este mes tiene 31 días");
                        break;
                    case 4:
                        System.out.println("Este mes tiene 30 días");
                        break;
                    case 5:
                        System.out.println("Este mes tiene 31 días");
                        break;
                    case 6:
                        System.out.println("Este mes tiene 30 días");
                        break;
                    case 7:
                        System.out.println("Este mes tiene 31 días");
                        break;
                    case 8:
                        System.out.println("Este mes tiene 31 días");
                        break;
                    case 9:
                        System.out.println("Este mes tiene 30 días");
                        break;
                    case 10:
                        System.out.println("Este mes tiene 31 días");
                        break;
                    case 11:
                        System.out.println("Este mes tiene 30 días");
                        break;
                    case 12:
                        System.out.println("Este mes tiene 31 días");
                        break;
            }
        }
    }
}
