package Tema4.Personas_Y_Cuentas;

import java.util.Scanner;

public class PruebaCuentas {
    public static void menu(){
        System.out.println("1.  Instanciar objetos tipo Persona");
        System.out.println("2.  Instanciar objetos de tipo Cuenta y asociarlo a una persona");
        System.out.println("3.  Mostrar datos de una persona (por su dni)");
        System.out.println("4.  Recibir la nomina mensual de una persona (por dni y numero de cuenta)");
        System.out.println("5.  Recibir un pago (por dni y numero de cuenta)");
        System.out.println("6.  Realizar transferencia entre cuentas");
        System.out.println("7.  Imprimir personas morosas");

        System.out.println("Elige una opcion");
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        menu();
        int opcion = in.nextInt();
        while (opcion>7 || opcion<1){
            System.out.println("Opcion no valida, intentelo de nuevo");
            opcion = in.nextInt();
        }

        switch (opcion){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:

        }
    }
}
