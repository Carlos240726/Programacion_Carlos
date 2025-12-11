package Tema3.Array;

import java.util.Scanner;

public class Tema3Array3 {

    public static int[] dispersion(int habitacion, int rango){
        int array[]=new int[20];
        array [habitacion]=rango;
        int contador=rango;
        int disperso=rango;
        int i=0;
        while (contador>0){
            i++;
            if (array[habitacion-i]>=0){
                array[habitacion-i]=disperso-i;
            }
            if (array[habitacion+i]<=20){
                array[habitacion+i]=disperso-i;
            }
            contador--;
        }
        return array;
    }

    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Instalacion de wifi en hotel");

        System.out.println("Dime la habitacion en la que lo quieres poner, tiene que ser entre el 1 y el 20");
        int habitacion= in.nextInt();
        while (habitacion<1||habitacion>20){
            System.out.println("Opcion no valida");
            habitacion=in.nextInt();
        }
        habitacion--;
        System.out.println("Dime el rango, tiene que ser entre el 1 y el 6");
        int rango= in.nextInt();
        while (rango<1||rango>6 || (habitacion-rango)<0 || (habitacion+rango)>20){
            System.out.println("Opcion no valida");
            rango=in.nextInt();
        }

        int [] array=dispersion(habitacion,rango);
        for (int i = 0; i <= 19; i++) {
            System.out.println("La casilla " + (i+1) + " del array es " + array[i]);
        }
    }
}
