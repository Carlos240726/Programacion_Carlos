package Tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class Tema3Array5 {

    public static void imprimirTablero(int[] tablero, boolean[] visible) {
        System.out.println("TABLERO:");
        for (int i = 0; i < tablero.length; i++) {
            if (visible[i]) {
                System.out.print(tablero[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    public static void mostrarTableroCompleto(int[] tablero) {
        System.out.println("Tablero real:");
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == -1) {
                System.out.print("* ");
            } else {
                System.out.print(tablero[i] + " ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[] tablero = new int[20];
        boolean[] visible = new boolean[20];

        int minasColocadas = 0;
        while (minasColocadas < 6) {
            int pos = random.nextInt(20);
            if (tablero[pos] != -1) {
                tablero[pos] = -1;
                minasColocadas++;
            }
        }


        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == -1) continue;

            int contador = 0;

            if (i > 0 && tablero[i - 1] == -1) contador++;


            if (i < 19 && tablero[i + 1] == -1) contador++;

            tablero[i] = contador;
        }


        boolean juegoTerminado = false;
        int casillasReveladas = 0;

        System.out.println("=== BUSCAMINAS ==");
        System.out.println("Hay 20 casillas (1-20) y 6 minas ocultas.");
        System.out.println("Escoge casillas. Si explotas una mina: pierdes.");

        while (!juegoTerminado) {

            imprimirTablero(tablero, visible);

            System.out.print("\nSelecciona una posición (1-20): ");
            int pos = in.nextInt();

            while (pos < 1 || pos > 20) {
                System.out.println("Posición inválida, intenta de nuevo.");
                pos = in.nextInt();
            }
            pos--;

            if (tablero[pos] == -1) {
                System.out.println("\n💥 BOOM!!! Has pisado una mina. GAME OVER.");
                mostrarTableroCompleto(tablero);
                juegoTerminado = true;
            } else {
                if (!visible[pos]) {
                    visible[pos] = true;
                    casillasReveladas++;
                }
                if (casillasReveladas == 14) {
                    System.out.println("¡HAS GANADO! Revelaste todo menos las minas.");
                    mostrarTableroCompleto(tablero);
                    juegoTerminado = true;
                }
            }
        }
    }
}

