package Tema3.String;

import java.util.Scanner;
import java.util.Arrays;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1, introduce la palabra: ");
        String palabraOriginal = sc.nextLine().toUpperCase();
        clearConsole(); // borrar pantalla para el jugador 2

        char[] palabra = palabraOriginal.toCharArray();
        char[] palabraAdivinar = new char[palabra.length];
        Arrays.fill(palabraAdivinar, '_');

        int intentos = 6;
        boolean ganaste = false;

        while (intentos > 0 && !ganaste) {
            System.out.println("Palabra: " + new String(palabraAdivinar));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Introduce una letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i] == letra) {
                    palabraAdivinar[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
            }

            ganaste = Arrays.equals(palabra, palabraAdivinar);
        }

        if (ganaste) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + new String(palabra));
        } else {
            System.out.println("Has perdido. La palabra era: " + new String(palabra));
        }

        sc.close();
    }

    // Limpiar consola (simulación)
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
}