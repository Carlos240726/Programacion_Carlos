package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame la hora");
        int Hora = in.nextInt();

        if (Hora > 23 || Hora < 0) {
            System.out.println("Eso no es una hora");
        } else {
            System.out.println("Dame los minutos");
            int Minuto = in.nextInt();

            if (Minuto > 60 || Minuto < 0) {
                System.out.println("Eso no son minutos");
            } else {
                System.out.println("Dame los segundos");
                int Sec = in.nextInt();

                if (Sec > 59 || Sec < 0) {
                    System.out.println("Eso no son segundos");
                } else {
                    Sec = Sec + 1;
                    if (Sec == 60) {
                        Sec = 00;
                        Minuto = Minuto + 1;
                    }
                    if (Minuto == 60) {
                        Minuto = 00;
                        Hora = Hora + 1;
                    }
                    if (Hora == 24) {
                        Hora = 00;
                        System.out.println("En un segundo seán las " + Hora + ":" + Minuto + ":" + Sec);
                    } else {
                        System.out.println("En un segundo seán las " + Hora + ":" + Minuto + ":" + Sec);
                    }
                }
            }
        }
    }
}
