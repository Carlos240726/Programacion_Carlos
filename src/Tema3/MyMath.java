package Tema3;

import java.util.Scanner;

public class MyMath {

    public static double squarePerimeter(int lado){
        int perimetro=lado*4;
        return perimetro;
    }
    public static double squareArea(int lado){
        int area=lado*lado;
        return area;
    }

    public static double rectanglePerimeter(int base, int altura){
        int perimetro = (2*base)+(2*altura);
        return perimetro;
    }
    public static double rectangleArea(int base, int altura){
        int area = base*altura;
        return area;
    }

    public static double circlePerimeter(int radio){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
    public static double circleArea(int radio){
        double area = Math.PI*radio*radio;
        return area;
    }
//--------------------------------------------------------------------------------------------------------------------
    public static boolean primo(int numero) {
        int contador = 0;
        int divisor = numero;
        while (divisor > 0) {
            int operacion = numero % divisor;
            divisor--;
            if (operacion == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            System.out.println("El numero es primo");
            return true;
        } else {
            //noprimo(numero);
            noprimo(numero);
            return false;
        }
    }

    public static void noprimo(int numero){
            System.out.println("El numero no es primo");
    }


   // public static boolean noprimo(int numero){
   //     return !primo(numero);
 //   }

//-------------------------------------------------------------------------------------------------------------------
    public static int nCifras(int entero){
        int contador = 0;

        if (entero == 0) {
            contador = 1;
        } else if (entero > 0){
            while (entero > 0){
                entero /= 10;
                contador++;
            }
        }
        return contador;
    }
//-------------------------------------------------------------------------------------------------------------------
    public static int nCifrasPares (int numero){
        int cifra = 0;
        int par = 0;
        while (numero !=0){
            cifra = numero%2;
            if (cifra==0){
                par++;
            }
            numero=numero/10;
        }
        return par;
    }
//-------------------------------------------------------------------------------------------------------------------
    public static int nCifrasImpares (int numero){
        int cifra = 0;
        int impar = 0;
        while (numero !=0){
            cifra = numero%2;
            if (cifra==1){
                impar++;
            }
            numero=numero/10;
        }
        return impar;
    }
//-------------------------------------------------------------------------------------------------------------------
    public static int factorial (int numero){
        int num1=numero;
        int num2=0;
        int contador=1;
        while (contador<num1){
            num2=numero;
            num2=numero*contador;
            numero=num2;
            contador++;
        }
        return num2;
    }
//-------------------------------------------------------------------------------------------------------------------
    public static int factorialRecursivo(int numero){
        while (numero>1){
            return numero * factorialRecursivo(numero-1);
        }
        return numero;
    }
//-------------------------------------------------------------------------------------------------------------------
    public static int equacion (int a, int b, int c){
        return (b*b)-(4*a*c);

    }
//-------------------------------------------------------------------------------------------------------------------
    public static int sumaDigitos(int numero){
        int total=numero;
        int repeticion=0;
        int digito=1;
        while (total>9){
            digito=digito/10;
            repeticion++;
        }
        total=0;
        while (repeticion>0){
            digito=digito*10;
            repeticion--;
        }
        while (numero>0){
            while (numero>=digito){
                numero=numero-digito;
                total++;
            }
            digito=digito/10;
        }
        return total;
        //TODO: intentar hacer con estas 2 sentencias
        /*
        suma=suma+numero%10
        numero=numero/10
         */
    }
//-------------------------------------------------------------------------------------------------------------------
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Me vas a dar varios numeros y te dire area y perimetro de unas figuras con esas medidas");

        System.out.println("Dame el primer numero");
        int num1 = in.nextInt();
        System.out.println("Dame el segundo numero");
        int num2 = in.nextInt();

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
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero positivo y te dire si es primo o no");
        num1 = in.nextInt();
        primo(num1);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero entero y te dire cuantas cifras tiene");
        num1 = in.nextInt();
        num1=nCifras(num1);
        System.out.println("El numero de cifras es " + num1);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero y te dire cuantas cifras son pares");
        num1 = in.nextInt();
        num1=nCifrasPares(num1);
        System.out.println("El numero de cifras pares es " + num1);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero y te dire cuantas cifras son impares");
        num1 = in.nextInt();
        num1=nCifrasImpares(num1);
        System.out.println("El numero de cifras impares es " + num1);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero y te dire su factorial");
        num1= in.nextInt();
        num2=factorial(num1);
        System.out.println("El factorial de " + num1 + " es " + num2);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero y te calculare su factorial de manera recursiva");
        num1= in.nextInt();
        num2=factorialRecursivo(num1);
        System.out.println("El factorial hecho de manera recursiva de " + num1 + " es " + num2);
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame 3 coeficientes de una ecuacion de segundo grado y te dire cuantas soluciones tiene la ecuacion");
        System.out.println("Primer coeficiente");
        num1=in.nextInt();
        System.out.println("Segundo coeficiente");
        num2=in.nextInt();
        System.out.println("Tercer coeficiente");
        int num3=in.nextInt();
        int num4=equacion(num1,num2,num3);
        if (num4>0){
            System.out.println("Tiene 2 soluciones");
        } else if (num4<0) {
            System.out.println("No tiene solucion");
        }else{
            System.out.println("Tiene una solucion");
        }
//--------------------------------------------------------------------------------------------------------
        System.out.println("Dame un numero y te sumare sus digitos");
        num1= in.nextInt();
        num2=sumaDigitos(num1);
        System.out.println("La suma de sus digitos es " + num2);

    }
}
