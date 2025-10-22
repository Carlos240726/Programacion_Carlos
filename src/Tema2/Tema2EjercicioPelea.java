package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2EjercicioPelea {
    public static void main(String[] args) {

        int atributos_p1 = 0;
        int salud_p1;
        int ataque_p1;
        int defensa_p1;
        int velocidad_p1;

        int atributos_p2 = 0;
        int salud_p2;
        int ataque_p2;
        int defensa_p2;
        int velocidad_p2;

        int bono;
        int num_random;

        int dmg_p1;
        int dmg_p2;

        System.out.println("Personaliza tu personaje, tus estadisticas no pueden superar los 500 totales ni 200 por estadistica");
        System.out.println("Jugador 1");

        System.out.println("Dame tus puntos de salud");
        Scanner in = new Scanner(System.in);
        salud_p1 = in.nextInt();
        while (salud_p1 <= 1 || salud_p1 > 200) {
            System.out.println("Eso no es posible");
            salud_p1 = in.nextInt();
        }
        atributos_p1 = atributos_p1 + salud_p1;
        System.out.println("Tienes asignados " + atributos_p1);

        System.out.println("Dame tus puntos de ataque");
        ataque_p1 = in.nextInt();
        while (ataque_p1 <= 1 || ataque_p1 > 200) {
            System.out.println("Eso no es posible");
            ataque_p1 = in.nextInt();
        }
        atributos_p1 = atributos_p1 + ataque_p1;
        System.out.println("Tienes asignados " + atributos_p1);

        System.out.println("Dame tus puntos de defensa");
        defensa_p1 = in.nextInt();
        while (defensa_p1 <= 1 || defensa_p1 > 500 - atributos_p1 -1) {
            System.out.println("Eso no es posible");
            defensa_p1 = in.nextInt();
        }
        atributos_p1 = atributos_p1 + defensa_p1;
        System.out.println("Tienes asignados " + atributos_p1);

        System.out.println("Los restantes seran asignados a velocidad");
        velocidad_p1 = 500 - atributos_p1;

        System.out.println("Atributos jugador 1");
        System.out.println("Salud:      " + salud_p1);
        System.out.println("Ataque:     " + ataque_p1);
        System.out.println("Defensa:    " + defensa_p1);
        System.out.println("Velocidad:  " + velocidad_p1);

        System.out.println("Jugador 2");

        System.out.println("Dame tus puntos de salud");
        salud_p2 = in.nextInt();
        while (salud_p2 <= 1 || salud_p2 > 200) {
            System.out.println("Eso no es posible");
            salud_p2 = in.nextInt();
        }
        atributos_p2 = atributos_p2 + salud_p2;
        System.out.println("Tienes asignados " + atributos_p2);

        System.out.println("Dame tus puntos de ataque");
        ataque_p2 = in.nextInt();
        while (ataque_p2 <= 1 || ataque_p2 > 200) {
            System.out.println("Eso no es posible");
            ataque_p2 = in.nextInt();
        }
        atributos_p2 = atributos_p2 + ataque_p2;
        System.out.println("Tienes asignados " + atributos_p2);

        System.out.println("Dame tus puntos de defensa");
        defensa_p2 = in.nextInt();
        while (defensa_p2 <= 1 || defensa_p2 > 500 - atributos_p2 -1) {
            System.out.println("Eso no es posible");
            defensa_p2 = in.nextInt();
        }
        atributos_p2 = atributos_p2 + defensa_p2;
        System.out.println("Tienes asignados " + atributos_p2);

        System.out.println("Los restantes seran asignados a velocidad");
        velocidad_p2 = 500 - atributos_p2;

        System.out.println("Atributos jugador 2");
        System.out.println("Salud:      " + salud_p2);
        System.out.println("Ataque:     " + ataque_p2);
        System.out.println("Defensa:    " + defensa_p2);
        System.out.println("Velocidad:  " + velocidad_p2);

        System.out.println("La batalla empieza");

        Random random = new Random();
        bono = random.nextInt(10);
        num_random = random.nextInt(10);

        dmg_p1 = ataque_p1 - (defensa_p2 * 30 /100) + bono;
        dmg_p2 =  ataque_p2 - (defensa_p1 * 30 /100) + bono;

        while (salud_p1 > 0 && salud_p2 > 0){

            if (velocidad_p1 > velocidad_p2){

                salud_p2 = salud_p2 - dmg_p1;
                System.out.println("La vida restante de jugador 2 es" + salud_p2);

                salud_p1 = salud_p1 - dmg_p2;
                System.out.println("La vida restante de jugador 1 es" + salud_p1);

            }else {

                if (velocidad_p1 < velocidad_p2){

                    salud_p1 = salud_p1 - dmg_p2;
                    System.out.println("La vida restante de jugador 1 es" + salud_p1);

                    salud_p2 = salud_p2 - dmg_p1;
                    System.out.println("La vida restante de jugador 2 es" + salud_p2);

                }
            }
        }
    }
}