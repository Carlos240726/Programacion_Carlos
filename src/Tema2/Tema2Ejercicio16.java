package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime a que quieres convertir (D = euro a dolar | E = dolar a euro)");
        String Tipo = in.nextLine();

        System.out.println("Dime la cantidad de dinero a convertir");
        double Cant = in.nextDouble();

        double total = 0;

        switch (Tipo){
            case "D":
                total = Cant * 0.86;
                System.out.println(Cant + " en dólares son " + total + "€");
                break;

            case "E":
                total = Cant * 1.17;
                System.out.println(Cant + " en euros son " + total + "$");
                break;
        }

        }
}
