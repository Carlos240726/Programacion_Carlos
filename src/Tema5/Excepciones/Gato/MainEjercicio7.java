package Tema5.Excepciones.Gato;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainEjercicio7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        while (listaGatos.size() < 5) {
            try {
                System.out.println("Gato " + (listaGatos.size() + 1));

                System.out.print("Introduce el nombre del gato: ");
                String nombre = in.nextLine();

                System.out.print("Introduce la edad del gato: ");
                int edad = in.nextInt();
                in.nextLine();

                Gato gato = new Gato(edad, nombre);

                listaGatos.add(gato);
                System.out.println("Gato registrado correctamente");

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero entero para la edad");
                in.nextLine();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nLista de gatos registrados:");

        for (int i = 0; i < listaGatos.size(); i++) {
            System.out.println("Gato " + (i + 1) + ":");
            System.out.println(listaGatos.get(i));
        }
    }
}
