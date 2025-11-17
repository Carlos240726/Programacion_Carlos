package Tema3;

import java.util.Scanner;


public class Tema3Ejercicio3 {

    public static boolean validRadius(int radio){
        if (radio<0){
            System.out.println("Ese valor no es correcto");
            return false;
        }else{
            System.out.println("El valor es correcto");
            return true;
        }
    }

    public static double calculateCirclePerimeter(int radio){

        System.out.println("Calculando perimetro");
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;

    }
    public static double calculateCircleArea(int radio){

        System.out.println("Calculando area");
        double area;
        area = Math.PI * (radio * radio);
        return area;
    }

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un radio");
        int radio = in.nextInt();
        boolean verificacion = validRadius(radio);

        if (verificacion == true){

            double perimetro = calculateCirclePerimeter(radio);
            System.out.println("El perimetro es " + perimetro);

            double area = calculateCircleArea(radio);
            System.out.println("El area es " + area);
        }
    }
}
