package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static double showMenu(int proceso, double euro, double dolar){
        double valor = 0;
        if (proceso==1){
            valor = euro * 1.16;
        } else if (proceso==2) {
            valor = dolar * 0.86;
        }
        return valor;

    }
    public static void main (String[] args){

        int proceso;
        double euro=0;
        double dolar=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Que divisa tienes, € o $? (1 = €) (2 = $)");
        proceso = in.nextInt();
        if (proceso != 1){
            if (proceso != 2){
                proceso = in.nextInt();
            }
        }
        System.out.println("Dame una cantidad de dinero");
        if (proceso == 1){
            euro = in.nextDouble();
            System.out.println("Ahora te lo pasaremos a dolares");
            double euro2dolar = showMenu(proceso,euro,dolar);
            System.out.println("De € a $ es " + euro2dolar);
        } else if (proceso == 2) {
            dolar = in.nextDouble();
            System.out.println("Ahora te lo pasaremos a euros");
            double dolar2euro = showMenu(proceso,euro,dolar);
            System.out.println("De € a $ es " + dolar2euro);
        }
    }
}
