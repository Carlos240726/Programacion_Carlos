package Tema4.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean opcion;
        String dni;
        String nombre;
        String apellidos;
        int edadP1;
        int edadP2;

        Scanner in = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Quieres datos predeterminados o ponerlos tu?");
        opcion=in.nextBoolean();
        in.nextLine();

        if (opcion){
            System.out.println("Dime tu dni");
            dni=in.next();

            System.out.println("Dime tu nombre");
            nombre=in.next();

            System.out.println("Dime tu apellido");
            apellidos=in.next();


            System.out.println("Dime tu edad");
            edadP1=in.nextInt();

            persona.Persona(dni,nombre,apellidos,edadP1);
/*
            persona.getDni(dni);
            persona.getNombre(nombre);*/
            persona.getApellidos(apellidos);
            persona.getEdad(edadP1);

            persona.toString();

            persona.isAdult(edadP1);
            persona.isRetired(edadP1);

            System.out.println("Dime la edad de otra persona");
            edadP2=in.nextInt();
            while (edadP2>122||edadP2<0){
                System.out.println("Valor no valido");
                edadP2=in.nextInt();
            }

            /*persona.ageDifference(edadP1,edadP2);*/
        }else {
            persona.Persona();
            persona.toString();
        }
    }
}
