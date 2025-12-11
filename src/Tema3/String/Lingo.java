package Tema3.String;

import java.util.Scanner;


public class Lingo {

    public static void verificacion (char[] palabra, char[] comprobar){
        int contador=0;
        char[] respuesta={'-','-','-','-','-'};

        while (contador<palabra.length){
            if (palabra[contador]==comprobar[contador]){
                respuesta[contador]='*';
            }
            contador++;
        }
        System.out.println(respuesta);

    }
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);

        char[] palabra = {'p','o','l','l','o'};

        int contador = 5;
        while (contador>0){
            System.out.println("Dame una palabra de 5 letras");
            String respuesta= in.next();
            char[] comprobar=respuesta.toCharArray();
            verificacion(palabra,comprobar);
            contador--;
        }
    }
}
