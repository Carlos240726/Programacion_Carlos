package Tema3.String;

import java.util.Scanner;

public class CaaesarCipher {
    public static char[] encrypt(char[] cifrar, char[] comprobar) {

        for (int i = 0; i < cifrar.length; i++) {

            for (int j = 0; j < comprobar.length; j++) {

                if (cifrar[i] == comprobar[j]) {
                    if (cifrar[i] == 'Z') {
                        cifrar[i] = 'A';
                    } else if (cifrar[i] == '9') {
                        cifrar[i] = '0';
                    } else {
                        cifrar[i] = comprobar[j + 1];
                    }
                    break;
                }
            }
        }
        return cifrar;
    }
    public static char[] decrypt(char[] cifrar, char[] comprobar) {

        for (int i = 0; i < cifrar.length; i++) {

            for (int j = 0; j < comprobar.length; j++) {

                if (cifrar[i] == comprobar[j]) {
                    if (cifrar[i] == 'A') {
                        cifrar[i] = 'Z';
                    } else if (cifrar[i] == '0') {
                        cifrar[i] = '9';
                    } else {
                        cifrar[i] = comprobar[j - 1];
                    }
                    break;
                }
            }
        }
        return cifrar;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Dame una cadena en mayusculas");
        String cadena= in.next();
        char[] cifrar=cadena.toCharArray();
        cadena="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
        char[] comprobar=cadena.toCharArray();
        String mostrar=String.copyValueOf(cifrar);
        System.out.println("La palabra a cifrar es " + mostrar);
        char[] respuesta;
        respuesta=encrypt(cifrar,comprobar);
        mostrar=String.copyValueOf(respuesta);
        System.out.println("La palabra cifrada es " + mostrar);
        respuesta=decrypt(cifrar,comprobar);
        mostrar=String.copyValueOf(respuesta);
        System.out.println("La palabra descifrada es " + mostrar);
    }
}
