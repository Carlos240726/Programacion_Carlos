package Tema5.Usuarios_Gimnasio;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class Mapa_Gimnasio {

    public static boolean verificacion (Map personas, String dni){
        if (personas.containsKey(dni)){
            return true;
        }else{
            System.out.println("Error, la persona no existe");
            return false;
        }
    }
    public static Map removerPersona(Map personas,String dni){
        if (personas.containsKey(dni)){
            personas.remove(dni);
        }
        return personas;
    }
    public static Map modificarPersona(Map personas, String dni, String nombre){
        if (personas.containsKey(dni)){
            personas.replace(dni,nombre);
        }
        return personas;
    }

    public static void menu(){
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Añadir usuario");
        System.out.println("2. Eliminar usuario");
        System.out.println("3. Mostrar usuario");
        System.out.println("4. Modificar usuario");
        System.out.println("0. Finaliza el programa");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map<String,Usuarios> personas = new LinkedHashMap<>();
        String dni;
        String nombre;
        int edad;
        int opcion;
        boolean continuar=true;
        boolean verificar=true;

        while (continuar){
            menu();
            opcion = in.nextInt();

            switch (opcion){
                case 0:
                    continuar=false;
                    break;
                case 1:
                    System.out.println("Dame el dni de la persona");
                    in.next();
                    dni=in.nextLine();
                    System.out.println("Dame el nombre de la persona");
                    nombre= in.nextLine();
                    System.out.println("Dame la edad de la persona");
                    edad= in.nextInt();
                    personas.put(dni,new Usuarios(edad,nombre));
                    break;
                case 2:
                    System.out.println("Dame el dni de la persona a eliminar");
                    in.next();
                    dni= in.nextLine();
                    verificar=verificacion(personas,dni);
                    if (verificar){
                    personas=removerPersona(personas,dni);
                    }
                    break;
                case 3:
                    System.out.println("Dame el dni de la persona a mostrar");
                    in.next();
                    dni= in.nextLine();
                    verificar=verificacion(personas,dni);
                    if (verificar){
                        System.out.println(personas.get(dni).toString());
                    }
                    break;
                case 4:
                    System.out.println("Dame el dni de la persona a modificar");
                    in.next();
                    dni= in.nextLine();
                    verificar=verificacion(personas,dni);
                    if (verificar) {
                        System.out.println("Dame el nombre que le quieres poner ahora");
                        in.next();
                        nombre= in.nextLine();
                        modificarPersona(personas,dni,nombre);
                    }
                    break;
            }
        }
    }
}
