package Tema5.Excepciones;

import java.util.*;
public class ExcepcionesEjercicio4 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[] vector= new int[random.nextInt(100)];
        int posicion=0;
        try {
            for (int i=0;i< vector.length;i++){
                vector[i]=random.nextInt(10);
            }
            while (posicion>=0){
                System.out.println("Dime una posicion del array, el array tiene " + vector.length + " posiciones");
                posicion=in.nextInt();
                System.out.println("El valor es " + vector[posicion]);
            }
        } catch (ArrayIndexOutOfBoundsException sobrepaso) {
            System.err.println("Esa posicion no existe");
        }catch (InputMismatchException incoincidente){
            System.err.println("El valor introducido es incorrecto");
        }
    }
}
