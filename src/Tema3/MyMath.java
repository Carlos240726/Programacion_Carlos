package Tema3;

import java.util.Scanner;

public class MyMath {

    public static void squarePerimeter(int lado){
        int perimetro=lado*4;
        System.out.println("El perimetro de un cuadrado es de " + perimetro);
    }
    public static void squareArea(int lado){
        int area=lado*lado;
        System.out.println("El area de un cuadrado es de " + area);
    }

    public static void rectanglePerimeter(int base, int altura){
        int perimetro = (2*base)+(2*altura);
        System.out.println("El perimetro de un rectangulo es de " + perimetro);
    }
    public static void rectangleArea(int base, int altura){
        int area = base*altura;
        System.out.println("El area de un rectangulo es de " + area);
    }

    public static void circlePerimeter(int radio){
        double perimetro = 2*Math.PI*radio;
        System.out.println("El perimetro de un circulo es de " + perimetro);
    }
    public static void circleArea(int radio){
        double area = Math.PI*radio*radio;
        System.out.println("El area de un circulo es de " + area);
    }

    public static void primo(int numero){
        int contador = 0;
        int divisor = numero;
        while (divisor>0){
            int operacion =numero%divisor;
            divisor--;
            if(operacion==0){
                contador++;
            }
        }
        if (contador<2){
            System.out.println("El numero no es primo");
        }
    }
    public static void noprimo(int numero){
        int contador = 0;
        int divisor = numero;
        while (divisor>0){
            int operacion =numero%divisor;
            divisor--;
            if(operacion==0){
                contador++;
            }
        }
        if (contador>2){
            System.out.println("El numero no es primo");
        }
    }

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Me vas a dar varios numeros y te dire area y perimetro de unas figuras con esas medidas");
        System.out.println("Dame el primer numero");
        int num1 = in.nextInt();

        System.out.println("Dame el segundo numero");
        int num2 = in.nextInt();

        System.out.println("Ahora empezaremos a calcular valores, espera un momento");
        squarePerimeter(num1);
        squareArea(num1);
        rectanglePerimeter(num1, num2);
        rectangleArea(num1, num2);
        circlePerimeter(num1);
        circleArea(num1);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero positivo y te dire si es primo o no");
        num1 = in.nextInt();
        primo(num1);
        noprimo(num1);

    }
}
