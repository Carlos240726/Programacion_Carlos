package Tema5;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Tema5Ejercicio1 {
    public static void main(String[] args){
    LinkedHashSet <String> listaCompra = new LinkedHashSet<>();
    Scanner in = new Scanner(System.in);

    boolean verificacion=true;
    int opcion=0;
    String valor= "";

    while (verificacion){
        System.out.println("Quieres añadir algo a la lista (0) o simplemente finalizar el proceso? (1)");
        opcion=in.nextInt();
        while (opcion!=1 && opcion!=0 ){
            System.out.println("Valor no valido, vuelve a intentarlo");
            opcion=in.nextInt();
            }
        switch (opcion){
            case 0:
                System.out.println("Introduce lo que quieres añadr a la lista");
                valor=in.next();
                if (listaCompra.contains(valor)){
                    System.out.println("El producto ya existe en la lista");
                }
                listaCompra.add(valor);
                break;
            case 1:
                System.out.println("Finalizando proceso...");
                verificacion=false;
                break;
            }
        }
        System.out.println(listaCompra);
    }
}
