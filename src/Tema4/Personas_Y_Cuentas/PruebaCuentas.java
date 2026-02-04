package Tema4.Personas_Y_Cuentas;

import java.util.Scanner;

public class PruebaCuentas {

    static Persona[] personas = new Persona[10];
    static int numPersonas = 0;

    public static void menu(){
        System.out.println("1.  Instanciar objetos tipo Persona");
        System.out.println("2.  Instanciar objetos de tipo Cuenta y asociarlo a una persona");
        System.out.println("3.  Mostrar datos de una persona (por su dni)");
        System.out.println("4.  Recibir la nomina mensual de una persona (por dni y numero de cuenta)");
        System.out.println("5.  Recibir un pago (por dni y numero de cuenta)");
        System.out.println("6.  Realizar transferencia entre cuentas");
        System.out.println("7.  Imprimir personas morosas");
        System.out.println("0.  Finaliza el programa");

        System.out.println("Elige una opcion");
    }
    public static Persona buscarPersona(String dni) {
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].getDni().equals(dni)) {
                return personas[i];
            }
        }
        return null;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String dni;
        Persona p = null;
        Cuenta c = null;

        menu();
        int opcion = in.nextInt();
        while (opcion>7 || opcion<0){
            System.out.println("Opcion no valida, intentelo de nuevo");
            opcion = in.nextInt();
        }

        switch (opcion){
            case 1:
                System.out.println("Introduce el dni");
                dni=in.next();

                p = new Persona(dni);
                personas[numPersonas]=p;
                numPersonas++;

                System.out.println("Persona creada con dni: " + dni);
            case 2:
                System.out.print("Introduce el DNI de la persona: ");
                dni = in.nextLine();

                p = buscarPersona(dni);
                if (p == null) {
                    System.out.println("No existe esa persona");
                    return;
                }

                System.out.print("Introduce numero de cuenta: ");
                String numCuenta = in.nextLine();
                System.out.print("Introduce saldo inicial: ");
                float saldo = in.nextFloat();
                in.nextLine();

                c = new Cuenta(numCuenta, saldo);
                p.añadirCuenta(c);

            case 3:
                System.out.print("Introduce el DNI: ");
                dni = in.nextLine();

                p.buscarPersona(dni);
                if (p == null) {
                    System.out.println("No existe esa persona");
                    return;
                }

                p.mostrarDatos();
            case 4:
                System.out.print("Introduce el DNI: ");
                 dni = in.nextLine();

                p = buscarPersona(dni);
                if (p == null) {
                    System.out.println("No existe esa persona");
                    return;
                }

                System.out.print("Introduce numero de cuenta: ");
                numCuenta = in.nextLine();

                c = p.buscarCuenta(numCuenta);
                if (c == null) {
                    System.out.println("Esa cuenta no existe");
                    return;
                }

                System.out.print("Introduce cantidad de la nomina: ");
                float cantidad = in.nextFloat();
                in.nextLine();

                c.recibirAbonos(cantidad);
            case 5:
                System.out.print("Introduce el DNI: ");
                dni = in.nextLine();

                p = buscarPersona(dni);
                if (p == null) {
                    System.out.println("No existe esa persona");
                    return;
                }

                System.out.print("Introduce numero de cuenta: ");
                numCuenta = in.nextLine();

                c = p.buscarCuenta(numCuenta);
                if (c == null) {
                    System.out.println("Esa cuenta no existe");
                    return;
                }

                System.out.print("Introduce cantidad a pagar: ");
                cantidad = in.nextFloat();
                in.nextLine();

                c.pagarRecibos(cantidad);
            case 6:
                System.out.println("--- CUENTA ORIGEN ---");
                System.out.print("DNI: ");
                String dniOrigen = in.nextLine();
                Persona pOrigen = buscarPersona(dniOrigen);
                if (pOrigen == null) {
                    System.out.println("No existe esa persona");
                    return;
                }

                System.out.print("Numero de cuenta: ");
                String numCuentaOrigen = in.nextLine();
                Cuenta cOrigen = pOrigen.buscarCuenta(numCuentaOrigen);
                if (cOrigen == null) {
                    System.out.println("Esa cuenta no existe");
                    return;
                }

                System.out.println("--- CUENTA DESTINO ---");
                System.out.print("DNI: ");
                String dniDestino = in.nextLine();
                Persona pDestino = buscarPersona(dniDestino);
                if (pDestino == null) {
                    System.out.println("No existe esa persona");
                    return;
                }

                System.out.print("Numero de cuenta: ");
                String numCuentaDestino = in.nextLine();
                Cuenta cDestino = pDestino.buscarCuenta(numCuentaDestino);
                if (cDestino == null) {
                    System.out.println("Esa cuenta no existe");
                    return;
                }

                System.out.print("Cantidad a transferir: ");
                cantidad = in.nextFloat();
                in.nextLine();

                cOrigen.pagarRecibos(cantidad);
                cDestino.recibirAbonos(cantidad);
                System.out.println("Transferencia realizada!");
            case 7:
                System.out.println("\n--- PERSONAS MOROSAS ---");
                boolean hayMorosas = false;

                for (int i = 0; i < numPersonas; i++) {
                    if (personas[i].esMorosa()) {
                        personas[i].mostrarDatos();
                        hayMorosas = true;
                    }
                }

                if (!hayMorosas) {
                    System.out.println("No hay personas morosas");
                }
            case 0:
                break;
        }
    }
}
