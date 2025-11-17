package Tema3;

public class Tema3Ejercicio6 {

    public static void main (String[] args){
        System.out.println("Mostrando las tablas de multiplicar del 1 al 10");

        int contador=1;
        while (contador<=10){
            Tema3Ejercicio5.Multiplicar(contador);
            System.out.println("-------------------------------------");
            contador++;
        }
    }
}
