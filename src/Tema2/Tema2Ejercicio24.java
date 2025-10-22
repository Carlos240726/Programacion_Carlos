package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main (String[] argsS){
        System.out.println("Introduce una nota, si introduce un numero menor a 0 se para el pregrama");
        Scanner in = new Scanner(System.in);
        int nota = in.nextInt();
        int aprobados = 0;
        int suspendidos = 0;
        while(nota > 0){
            if (nota >= 5 && nota<=10){
                aprobados++;

            }else{
                suspendidos++;
            }
            nota = in.nextInt();
        }
        System.out.println("Aprobados " + aprobados + " Suspendidos " + suspendidos);
    }
}
