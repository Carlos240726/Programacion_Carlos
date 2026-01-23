package Tema4.Reloj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean opcion;
        int valor;
        int hora;
        int minutos;
        int segundos;

        Scanner in = new Scanner(System.in);
        Reloj reloj = new Reloj();

        System.out.println("Que opcion quieres, datos predeterminados (false) o insertar rus propios datos? (true)");
        opcion=in.nextBoolean();
        if (opcion){

            System.out.println("Formato de 24 horas (1) o de 12 (2)?");
            valor=in.nextInt();
            if (valor==1){
                reloj.formato24=true;
            }else {
                reloj.formato24=false;
            }

            reloj.getFormato24(reloj.formato24);

            System.out.println("Que hora es?");
            hora=in.nextInt();
            reloj.hora=hora;

            reloj.getHora(reloj.hora, reloj.formato24);

            System.out.println("Cuantos minutos?");
            minutos=in.nextInt();
            reloj.minutos=minutos;

            reloj.getMinutos(reloj.minutos);

            System.out.println("Cuantos segundos?");
            segundos=in.nextInt();
            reloj.segundos=segundos;

            reloj.getSegundos(reloj.segundos);

            reloj.showMenu();

        }else{
            reloj.Reloj();
            reloj.getFormato24(reloj.formato24);
            reloj.getHora(reloj.hora, reloj.formato24);
            reloj.getMinutos(reloj.minutos);
            reloj.getSegundos(reloj.segundos);

            reloj.showMenu();
        }
        System.out.println("Pruebas print reloj");
        System.out.println(reloj);
    }
}
