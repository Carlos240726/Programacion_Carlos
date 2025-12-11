package Tema3.Array;

import java.util.Scanner;

public class Tema3Array {

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    //-----------------------------------------------------------------------------
    public static int maximoArray(int[] array) {
        int maximo = array[0];
        for (int contador = 0; contador < array.length; contador++) {
            if (maximo < array[contador]) {
                maximo = array[contador];
            }
        }
        return maximo;
    }
    //-----------------------------------------------------------------------------
    public static int minimoArray(int[] array) {
        int minimo = array[0];
        for (int contador = 0; contador < array.length; contador++) {
            if (minimo > array[contador]) {
                minimo = array[contador];
            }
        }
        return minimo;
    }
    //-----------------------------------------------------------------------------
    public static double mediaArray(int[] array) {
        double media = 0;
        for (int contador = 0; contador < array.length; contador++) {
            media = media + array[contador];
        }
        media = media / (array.length + 1);
        return media;
    }
    //-----------------------------------------------------------------------------
    public static boolean verificarArray(int[] array, int numero) {
        boolean verificacion = false;
        for (int i = 0; i <= 8; i++) {
            if (array[i] == numero) {
                System.out.println(array[i]);
                verificacion = true;
            }
        }
        if (verificacion) {
            System.out.println("El numero " + numero + " si aparece en el array");
            return true;
        } else {
            System.out.println("El numero " + numero + " no aparece en el array");
            return false;
        }
    }
    //-----------------------------------------------------------------------------
    public static int[] sumaArray(int[] array, int[] array2) {
        int suma[] = new int[9];
        for (int i = 0; i <= 8; i++) {
            System.out.println("La casilla " + i + " del array 1 es " + array[i]);
            System.out.println("La casilla " + i + " del array 2 es " + array2[i]);
            suma[i]= array[i] + array2[i];
            System.out.println("La casilla " + i + " de la suma es " + suma[i]);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
        return suma;
    }
    //-----------------------------------------------------------------------------
    public static int[] restaArray(int[] array, int[] array2){
        int resta[] = new int[9];
        for (int i = 0; i <= 8; i++) {
            System.out.println("La casilla " + i + " del array 1 es " + array[i]);
            System.out.println("La casilla " + i + " del array 2 es " + array2[i]);
            resta[i]= array[i] - array2[i];
            System.out.println("La casilla " + i + " de la resta es " + resta[i]);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
        return resta;
    }
    //-----------------------------------------------------------------------------
    public static int[] multiArray(int[] array, int [] array2){
        int multi[] = new int[9];
        for (int i = 0; i <= 8; i++) {
            System.out.println("La casilla " + i + " del array 1 es " + array[i]);
            System.out.println("La casilla " + i + " del array 2 es " + array2[i]);
            multi[i]= array[i] * array2[i];
            System.out.println("La casilla " + i + " de la multiplicacion es " + multi[i]);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
        return multi;
    }
    public static int[] invetirArray(int[] array){
        int invertir[] = new int[9];
        for (int i=0;i<=8;i++){
            invertir[i]=array[8-i];
            System.out.println("La casilla " + i + " con el valor " + invertir[i] + " de la inversion equivale a la casilla " + (8-i) + " con el valor " + array[8-i] + " del array");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
        return invertir;
    }
    public static void invetirArrayProcedimiento(int[] array){
        int invertir[] = new int[9];
        for (int i=0;i<=8;i++){
            invertir[i]=array[8-i];
            System.out.println("La casilla " + i + " con el valor " + invertir[i] + " de la inversion equivale a la casilla " + (8-i) + " con el valor " + array[8-i] + " del array");
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
    }
    public static boolean capicuaArray(int [] array){
        boolean verificacion=true;
        int numero=array.length-1;
        for (int i=0;i<=array.length/2;i++){
            if (array[i]!=array[numero]){
                verificacion=false;
            }
            numero--;
        }
        return verificacion;
    }
    public static void menu(){
        System.out.println("Que caso quieres hacer?");
        System.out.println("1. Mostrar array");
        System.out.println("2. Mostrar casilla mas grande");
        System.out.println("3. Mostrar casilla mas pequeña");
        System.out.println("4. Mostrar media del array");
        System.out.println("5. Mostar si un elemento existe o no en el array");
        System.out.println("6. Mostrar la suma de 2 array");
        System.out.println("7. Mostrar la resta de un array");
        System.out.println("8. Mostrar la multiplicacion de un array");
        System.out.println("9. Invertir el orden con un metodo de un array");
        System.out.println("10. Invertir el orden con un procedimiento de un array");
        System.out.println("11. Verificar si es capicua");
    }
    public static int[] array(int longitud){
        int[] array1;
        array1=new int[longitud];
        Scanner in=new Scanner(System.in);
        for (int casilla=0;casilla<=longitud-1;casilla++){
            System.out.println("Dime el valor de la casilla " + casilla);
            array1[casilla]=in.nextInt();
        }
        return array1;
    }
}
