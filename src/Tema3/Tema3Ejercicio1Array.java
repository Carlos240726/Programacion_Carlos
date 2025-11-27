package Tema3;

public class Tema3Ejercicio1Array {
    public static void imprimirArray(int []array){
        for (int i=0; i<=8; i++){
            System.out.println(array[i]);
        }
    }
//-----------------------------------------------------------------------------
    public static int maximoArray(int []array){
        int maximo = 0;
        int posicion = 1;
        int contador = 0;
        while (contador <= array.length){
            if (array[maximo]< array[posicion]){
                maximo=posicion;
                posicion++;
            }
            contador++;
        }
        return maximo;
    }
// -----------------------------------------------------------------------------

    public static void main(String[] args){
        int []array;
        array=new int[]{11,25,36,18,42,95,75,10,23};
        System.out.println("Te voy a mostrar to array casilla por casilla");
        imprimirArray(array);
//-----------------------------------------------------------------------------
        System.out.println("Te voy a mostrar la caslla con el valor mas grande");
        int num1=maximoArray(array);
        System.out.println("La casilla mas grande es " + num1 + " con el valor " + array[num1]);
    }
}
