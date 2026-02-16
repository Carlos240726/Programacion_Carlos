package Tema5.Banco;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    public static void menu(){
        System.out.println("Que quieres hacer?");
        System.out.println("1. Añadir persona");
        System.out.println("2. Atender persona");
        System.out.println("3. Eliminar persona");
        System.out.println("0. Finalizar bucle");
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        List<Usuarios> usuarios=new LinkedList<>();
        boolean continuacion=true;
        String dni;
        String nombre;
        int edad;
        int posicion;


        while (continuacion){
            System.out.println("Selecciona la opcion a realizar: ");
            menu();
            int opcion = in.nextInt();
            while (opcion!=0 && opcion!=1 && opcion!=2 && opcion!=3){
                System.out.println("Opcion no disponible, vuelva a introducir los datos");
                opcion= in.nextInt();
            }
            switch (opcion){
                case 0:
                    continuacion=false;
                    break;
                case 1:
                    in.nextLine();
                    System.out.print("Dime el DNI: ");
                    dni = in.nextLine();
                    System.out.print("Dime el nombre: ");
                    nombre = in.nextLine();
                    System.out.print("Dime la edad: ");
                    edad = in.nextInt();
                    in.nextLine();
                    usuarios.add(new Usuarios(nombre, dni, edad));
                    System.out.println("Persona añadida correctamente.");
                    break;
                case 2:
                    System.out.println(usuarios.get(0).toString());
                    System.out.println("Persona atendida");
                    usuarios.remove(0);
                    break;
                case 3:
                    System.out.println("dame una posicion de la cola, la persona que tenga ese numero sera eliminada");
                    posicion=in.nextInt();
                    while (posicion<0||posicion>usuarios.size()){
                        System.out.println("Posicion no valida, intentelo de nuevo");
                        posicion= in.nextInt();
                    }
                    posicion=posicion-1;
                    System.out.println(usuarios.get(posicion).toString());
                    System.out.println("persona eliminada");
                    usuarios.remove(posicion);
                    break;
            }
        }
    }
}
