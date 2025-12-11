package Tema3.String;

import java.util.Scanner;


public class Lingo {

    public static boolean verificacion (char[] palabra, char[] comprobar){
        int contador=0;
        char[] respuesta={'-','-','-','-','-'};

        while (contador<palabra.length){
            if (palabra[contador]==comprobar[contador]){
                respuesta[contador]='*';
            }
            contador++;
        }
        System.out.println(respuesta);
        contador=0;
        for (int i=0;i<palabra.length;i++){
            if (palabra[i]==comprobar[i]){
                contador++;
            }
        }
        if (contador==5){
            return true;
        }else {
            return false;
        }
    }
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);

        char[] palabra = {'p','o','l','l','o'};

        boolean comprobacion=false;
        int contador = 5;
        while (contador>0 && !comprobacion){
            System.out.println("Dame una palabra de 5 letras");
            String respuesta= in.next();
            char[] comprobar=respuesta.toCharArray();
            comprobacion=verificacion(palabra,comprobar);
            contador--;
        }
    }
}
