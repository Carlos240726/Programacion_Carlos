package Tema3.Array;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;


public class Tema3Array2 {

    public static int[] movimiento(int[] casillas) {
        int maximo = casillas[0];
        for (int contador = 0; contador < casillas.length; contador++) {
            if (maximo < casillas[contador]) {
                maximo = casillas[contador];
            }
        }
        casillas[maximo] = 0;
        Random random = new Random();
        casillas[random.nextInt(15)] = 1;
        return casillas;
    }

    public static boolean verificacion(int[] casillas, int num1) {
            if (casillas[num1] == 1) {
                System.out.println("La has matado");
                casillas[num1] = 0;
                return true;
            } else if (casillas[num1 + 1] == 1 || casillas[num1 - 1] == 1) {
                System.out.println("La mosca te ha notado y se ha movido");
                movimiento(casillas);
                return false;
            } else {
                System.out.println("La mosca no te ha notado, vuelve a intentarlo");
                return false;
            }
    }

    public static boolean caso0(int[] casillas, int num1){
            if (casillas[num1] == 1) {
                System.out.println("La has matado");
                casillas[num1] = 0;
                return true;
            } else if (casillas[num1 + 1] == 1) {
                System.out.println("La mosca te ha notado y se ha movido");
                movimiento(casillas);
                return false;
            } else {
                System.out.println("La mosca no te ha notado, vuelve a intentarlo");
                return false;
            }
    }
    public static boolean menu (int[] casillas, int num1) {
        if (num1!=0 || num1!=14){
            return verificacion(casillas,num1);
        }else if(num1==0){
            return caso0(casillas, num1);
        } else{
            return  caso14(casillas, num1);
        }
    }
    public static boolean caso14(int[] casillas, int num1){

            if (casillas[num1] == 1) {
                System.out.println("La has matado");
                casillas[num1] = 0;
                return true;
            } else if (casillas[num1 - 1] == 1) {
                System.out.println("La mosca te ha notado y se ha movido");
                movimiento(casillas);
                return false;
            } else {
                System.out.println("La mosca no te ha notado, vuelve a intentarlo");
                return false;
            }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Random random=new Random();

        int casillas[]= new int[15];
        casillas[random.nextInt(15)]=1;

        System.out.println("Trata de matar a la mosca");

        int contador=0;
        boolean verificar=false;
        while (!verificar){
            System.out.println("Dame una casilla numero");
            int num1=in.nextInt();
            while (num1<0 || num1>14){
                System.out.println("Valor incorrecto, intentalo de nuevo");
                num1=in.nextInt();
            }
            verificar=menu(casillas, num1);
            contador++;
        }
        System.out.println("Has tardado " + contador + " intentos");
    }
}
