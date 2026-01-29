package Tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class Tema3Array4 {

    public static int validadorNumero(int numero) {
        Scanner in = new Scanner(System.in);
        while (numero < 1 || numero > 20) {
            System.out.println("Opción no válida, introduzca otro número (1-20):");
            numero = in.nextInt();
        }
        return numero;
    }

    public static int[] validadorPareja(int array[], int num1, int num2) {
        if (num1 == num2) {
            System.out.println("No puedes seleccionar la misma casilla dos veces.");
            return array;
        }
        if (array[num1] == -1 || array[num2] == -1) {
            System.out.println("Una de las casillas ya ha sido adivinada.");
            return array;
        }

        int valor1 = array[num1];
        int valor2 = array[num2];

        if (valor1 == valor2) {
            System.out.println("Has adivinado una pareja! El valor era " + valor1);
            array[num1] = -1;
            array[num2] = -1;
        } else {
            System.out.println("Los valores son diferentes. Los valores eran " + valor1 + " y " + valor2);
            System.out.println("Más suerte a la proxima.");
        }
        System.out.println("---------------------------------------");
        return array;
    }

    public static int casillasNoAdivinadas(int array[]) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirTablero(int[] array) {
        System.out.println("=== TABLERO DE PAREJAS ===");
        System.out.print("Posición: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d ", i + 1);
        }
        System.out.println();
        System.out.print("Valores:  ");
        for (int valor : array) {
            if (valor == -1) {
                System.out.print(" X ");
            } else {
                System.out.print(" ? ");
            }
        }
        System.out.println();
        System.out.println("==========================");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int array[] = new int[20];
        int casillasRestantes = 20;
        int numero = 1;
        int valoresColocados = 0;

        while (casillasRestantes > 0) {
            int pos = random.nextInt(20);
            if (array[pos] == 0) {
                array[pos] = numero;
                valoresColocados++;
                casillasRestantes--;

                if (valoresColocados % 2 == 0) {
                    numero++;
                }
            }
        }

        int parejasRestantes = 10;

        System.out.println("=== JUEGO DE PAREJAS (MEMORIA) ===");
        System.out.println("Hay 20 casillas (1-20) y 10 parejas ocultas.");

        while (parejasRestantes > 0) {

            imprimirTablero(array);

            System.out.println("Quedan " + parejasRestantes + " parejas por encontrar.");

            System.out.print("Dame la primera posición (1-20): ");
            int num1 = in.nextInt();
            num1 = validadorNumero(num1);
            num1--;

            System.out.print("Dame la segunda posición (1-20): ");
            int num2 = in.nextInt();
            num2 = validadorNumero(num2);
            num2--;

            array = validadorPareja(array, num1, num2);

            parejasRestantes = casillasNoAdivinadas(array) / 2;
        }

        System.out.println("FELICIDADES! Has encontrado todas las parejas!");
        System.out.println("--- Juego Terminado ---");
    }
}