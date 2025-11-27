package Tema3;

import java.util.Scanner;

import static Tema3.MyMath.*;

public class Ejercicio10 {

    public static void menu (){
        System.out.println("1. Me vas a dar varios numeros y te dire area y perimetro de unas figuras con esas medidas");
        System.out.println("2. Dame un numero positivo y te dire si es primo o no");
        System.out.println("3. Dame un numero entero y te dire cuantas cifras tiene");
        System.out.println("4. Dame un numero y te dire cuantas cifras son pares");
        System.out.println("5. Dame un numero y te dire cuantas cifras son impares");
        System.out.println("6. Dame un numero y te dire su factorial");
        System.out.println("7. Dame un numero y te calculare su factorial de manera recursiva");
        System.out.println("8. Dame 3 coeficientes de una ecuacion de segundo grado y te dire cuantas soluciones tiene la ecuacion");
        System.out.println("9. Dame un numero y te sumare sus digitos");
    }
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        int num4;
        menu();
        System.out.println("Dime que quieres hacer");
        Scanner in=new Scanner(System.in);
        num1 = in.nextInt();

        while (num1<1 || num1>9){
            System.out.println("Ese numero no es correcto");
            num1= in.nextInt();
        }

        switch (num1){
            case 1:
                System.out.println("Dame el primer numero");
                num1 = in.nextInt();
                System.out.println("Dame el segundo numero");
                num2 = in.nextInt();

                System.out.println("Ahora empezaremos a calcular valores, espera un momento");
                double perimetro=squarePerimeter(num1);
                System.out.println("El perimetro de un cuadrado es de " + perimetro);
                double area=squareArea(num1);
                System.out.println("El area de un cuadrado es de " + area);
                perimetro=rectanglePerimeter(num1, num2);
                System.out.println("El perimetro de un rectangulo es de " + perimetro);
                area=rectangleArea(num1, num2);
                System.out.println("El area de un rectangulo es de " + area);
                perimetro=circlePerimeter(num1);
                System.out.println("El perimetro de un circulo es de " + perimetro);
                area=circleArea(num1);
                System.out.println("El area de un circulo es de " + area);
                break;
            case 2:
                System.out.println("Dame un numero positivo y te dire si es primo o no");
                num1 = in.nextInt();
                System.out.println("el numero " + num1 + "es primo?");
                primo(num1);
                if (primo(num1)){
                    System.out.println("El numero es primo");
                }else if(!primo(num1)){
                    System.out.println("El numero no es primo");
                }
                break;
            case 3:
                System.out.println("Dame un numero entero y te dire cuantas cifras tiene");
                num1 = in.nextInt();
                num1=nCifras(num1);
                System.out.println("El numero de cifras es " + num1);
                break;
            case 4:
                System.out.println("Dame un numero y te dire cuantas cifras son pares");
                num1 = in.nextInt();
                num1=nCifrasPares(num1);
                System.out.println("El numero de cifras pares es " + num1);
                break;
            case 5:
                System.out.println("Dame un numero y te dire cuantas cifras son impares");
                num1 = in.nextInt();
                num1=nCifrasImpares(num1);
                System.out.println("El numero de cifras impares es " + num1);
                break;
            case 6:
                System.out.println("Dame un numero y te dire su factorial");
                num1= in.nextInt();
                num2=factorial(num1);
                System.out.println("El factorial de " + num1 + " es " + num2);
                break;
            case 7:
                System.out.println("Dame un numero y te calculare su factorial de manera recursiva");
                num1= in.nextInt();
                num2=factorialRecursivo(num1);
                System.out.println("El factorial hecho de manera recursiva de " + num1 + " es " + num2);
                break;
            case 8:
                System.out.println("Dame 3 coeficientes de una ecuacion de segundo grado y te dire cuantas soluciones tiene la ecuacion");
                System.out.println("Primer coeficiente");
                num1=in.nextInt();
                System.out.println("Segundo coeficiente");
                num2=in.nextInt();
                System.out.println("Tercer coeficiente");
                num3=in.nextInt();
                num4=equacion(num1,num2,num3);
                if (num4>0){
                    System.out.println("Tiene 2 soluciones");
                } else if (num4<0) {
                    System.out.println("No tiene solucion");
                }else{
                    System.out.println("Tiene una solucion");
                }
                break;
            case 9:
                System.out.println("Dame un numero y te sumare sus digitos");
                num1= in.nextInt();
                num2=sumaDigitos(num1);
                System.out.println("La suma de sus digitos es " + num2);
                break;
        }
    }
}
