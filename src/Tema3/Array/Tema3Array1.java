package Tema3.Array;

import java.util.Scanner;
import static Tema3.Tema3Array.*;


public class Tema3Array1 {
//-----------------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos a introducir los array");
        System.out.println("Dame la longitud del primer array, empezando desde 1");
        int num1=in.nextInt();
        while (num1<3){
            System.out.println("Tiene que ser mayor a 3, prueba otra vez");
            num1=in.nextInt();
        }
        int []array=array(num1);

        System.out.println("Dame la longitud del segundo array, empezando desde 1");
        num1=in.nextInt();
        while (num1<3){
            System.out.println("Tiene que ser mayor a 3, prueba otra vez");
            num1=in.nextInt();
        }
        int []array2=array(num1);


        menu();
        num1= in.nextInt();
        switch (num1){
            case 1:
                System.out.println("Te voy a mostrar to array casilla por casilla");
                imprimirArray(array);
                break;
            case 2:
                System.out.println("Te voy a mostrar el valor mas grande del array");
                num1 = maximoArray(array);
                System.out.println("El valor mas grande es " + num1);
                break;
            case 3:
                System.out.println("Te voy a mostrar el valor mas pequeño del array");
                num1 = minimoArray(array);
                System.out.println("El valor mas pequeño es " + num1);
            case 4:
                System.out.println("Te voy a decir la media del array");
                double media = mediaArray(array);
                System.out.println("La media es " + media);
            case 5:
                System.out.println("Te voy a decir si un elemento existe o no en el array");
                System.out.println("Introduce el numero");
                num1 = in.nextInt();
                verificarArray(array, num1);
                System.out.println("----------------------");
            case 6:
                System.out.println("Te voy a mostrar la suma de 2 arrays");
                sumaArray(array, array2);
            case 7:
                System.out.println("Ahora te mostrare la resta de los 2 arrays");
                restaArray(array,array2);
            case 8:
                System.out.println("Ahora te mostrare la multiplicacion de los 2 arrays");
                multiArray(array,array2);
            case 9:
                System.out.println("Ahora vamos a invertir el orden del array");
                invetirArray(array);
            case 10:
                System.out.println("----------------------------------------------------");
                System.out.println("Ahora vamos a hacerlo con un procedimiento");
                invetirArrayProcedimiento(array2);
            case 11:
                System.out.println("Ahora vamos a verificar si el array es capicua");
                boolean verificacion;
                verificacion=capicuaArray(array);
                if (verificacion){
                    System.out.println("Es capicua");
                }else {
                    System.out.println("No es capicua");
                }
        }
    }
}