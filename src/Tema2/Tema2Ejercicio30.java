package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args){

        int operacion;
        boolean otra = true;

        while (otra == true){

            System.out.println("Dame un numero");
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();

            System.out.println("Dime una operacion con simbolos (+ - * / %)");
            String simbolo = in.next();

            System.out.println("Dame un numero");
            int num2 = in.nextInt();

            switch (simbolo) {
                case "+":
                    operacion = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + operacion);
                    break;
                case "-":
                    operacion = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + operacion);
                    break;
                case "*":
                    operacion = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + operacion);
                    break;
                case "/":
                    operacion = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + operacion);
                    break;
                case "%":
                    operacion = num1 % num2;
                    System.out.println(num1 + "%" + num2 + "=" + operacion);
                    break;
            }
            System.out.println("Quieres seguir?");
            String respuesta = in.next();

            otra = respuesta.equals("si");
        }
    }
}

