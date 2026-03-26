package Tema7.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BusquedaPi {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String rutalectura = "src/Tema7/Ejercicio6/pi-million.txt";
        boolean verificar = false;

        System.out.println("Dime un numero: ");
        int numero = in.nextInt();
        String valor = Integer.toString(numero);

        String pi = "";

        try (BufferedReader br = new BufferedReader(new FileReader(rutalectura))) {
            String line;
            while ((line = br.readLine()) != null) {
                pi = pi + line;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (int i = 0; i <= pi.length() - valor.length(); i++) {
            boolean coincide = true;
            for (int j = 0; j < valor.length(); j++) {
                if (pi.charAt(i + j) != valor.charAt(j)) {
                    coincide = false;
                    break;
                }
            }
            if (coincide) {
                verificar = true;
                break;
            }
        }

        if (verificar) {
            System.out.println("Tu numero aparece");
        } else {
            System.out.println("Tu numero no aparece");
        }
    }
}