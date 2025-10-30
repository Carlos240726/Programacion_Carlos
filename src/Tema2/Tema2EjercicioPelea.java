package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2EjercicioPelea {
    public static void main(String[] args) {

        int atributos_p1 = 0;
        int salud_p1 = 0;
        int ataque_p1 = 0;
        int defensa_p1 = 0;
        int velocidad_p1 = 0;
        int valor_p1 = 0;
        int bono_p1 = 0;
        int accion_p1;

        int atributos_p2 = 0;
        int salud_p2 = 0;
        int ataque_p2 = 0;
        int defensa_p2 = 0;
        int velocidad_p2 = 0;
        int valor_p2 = 0;
        int bono_p2 = 0;
        int accion_p2 = 0;

        Boolean equivalencia = false;
        int rondas = 0;
        int contador = 0;

        int bono;
        int num_random;

        int dmg_p1 = 0;
        int dmg_p2 = 0;

        int opcion = 0;
        int eleccion_p1 = 0;
        int personaje_p1 = 0;
        int eleccion_p2 = 0;
        int personaje_p2 = 0;

        String turno;

        System.out.println("Personaliza tu personaje (1), o elegir uno preeterminado? (2)");
        Scanner in = new Scanner(System.in);
        eleccion_p1 = in.nextInt();
        switch (eleccion_p1) {

            case 1:
                if (eleccion_p1 == 1) ;

                System.out.println("Jugador 1");

                System.out.println("Dame tus puntos de salud");
                salud_p1 = in.nextInt();
                while (salud_p1 < 1 || salud_p1 > 200) {
                    System.out.println("Eso no es posible");
                    salud_p1 = in.nextInt();
                }
                atributos_p1 = atributos_p1 + salud_p1;
                valor_p1 = atributos_p1;
                System.out.println("Tienes asignados " + atributos_p1);

                System.out.println("Dame tus puntos de ataque");
                ataque_p1 = in.nextInt();
                while (ataque_p1 < 1 || ataque_p1 > 200) {
                    System.out.println("Eso no es posible");
                    ataque_p1 = in.nextInt();
                }
                atributos_p1 = atributos_p1 + ataque_p1;
                valor_p1 = atributos_p1;
                System.out.println("Tienes asignados " + atributos_p1);

                System.out.println("Dame tus puntos de defensa");
                defensa_p1 = in.nextInt();
                while (defensa_p1 < 1 || defensa_p1 >= 200) {

                    if (atributos_p1 + defensa_p1 == 500) {

                        defensa_p1 = defensa_p1 - 1;

                    }

                    System.out.println("Eso no es posible");
                    defensa_p1 = in.nextInt();
                }
                atributos_p1 = atributos_p1 + defensa_p1;
                valor_p1 = atributos_p1;
                System.out.println("Tienes asignados " + atributos_p1);

                System.out.println("Dame tu velocidad");
                velocidad_p1 = in.nextInt();
                valor_p1 = valor_p1 + velocidad_p1;
                while (velocidad_p1 < 1 || velocidad_p1 > 200 || valor_p1 > 500) {

                    velocidad_p1 = 500 - atributos_p1;
                    velocidad_p1 = in.nextInt();
                }

                System.out.println("Atributos jugador 1");
                System.out.println("Salud:      " + salud_p1);
                System.out.println("Ataque:     " + ataque_p1);
                System.out.println("Defensa:    " + defensa_p1);
                System.out.println("Velocidad:  " + velocidad_p1);


            case 2:
                if (eleccion_p1 == 2) {
                    System.out.println("Que personaje quieres?");
                    System.out.println("            Caballero       Mago        Asesino     Clerigo");
                    System.out.println("Salud       99              100         50          100");
                    System.out.println("Ataque      200             50         200         100");
                    System.out.println("Defensa     200             50          50          100");
                    System.out.println("Velocidad   1               100         200         100");
                    System.out.println("Habilidades Caballero: Reduccion de daño (pasiva) y espada de aura (activa)");
                    System.out.println("Habilidades Mago: Cañon de cristal (pasiva) y bola de fuego (activa)");
                    System.out.println("Habilidades Asesino: Evasion (pasiva) y veneno (pasiva)");
                    System.out.println("Habilidades Clerigo: Sanacion (activa) y plegaria (activa)");

                    System.out.println("Cual quieres entonces, con numeros del 1 al 4, las habilidades se explicaran despues de la seleccion del personaje");
                    personaje_p1 = in.nextInt();
                    switch (personaje_p1) {

                        case 1:
                            if (personaje_p1 == 1) {

                                System.out.println("Caballero");
                                System.out.println("Recibe un 30% menos de daño ");
                                salud_p1 = 99;
                                ataque_p1 = 200;
                                defensa_p1 = 200 + (200*30/100);
                                velocidad_p1 = 1;

                            }
                        case 2:
                            if (personaje_p1 == 2) {

                                System.out.println("Mago");
                                System.out.println("Recibe un 5% mas de daño y hace un 40% mas de daño");
                                salud_p1 = 100;
                                ataque_p1 = 50 + (50*40/100);
                                defensa_p1 = 50 - (50*5/100);
                                velocidad_p1 = 100;

                            }
                        case 3:
                            if (personaje_p1 == 3) {

                                System.out.println("Asesino");
                                System.out.println("En cada turno causa 1 daño");
                                salud_p1 = 50;
                                ataque_p1 = 200;
                                defensa_p1 = 50;
                                velocidad_p1 = 200;

                            }
                        case 4:
                            if (personaje_p1 == 4) {

                                System.out.println("Clerigo");
                                System.out.println("Sanacion causa que se cure el doble");
                                salud_p1 = 100;
                                ataque_p1 = 100;
                                defensa_p1 = 100;
                                velocidad_p1 = 100;

                            }
                    }
                }
        }
        System.out.println("Personaliza tu personaje (1), o elegir uno preeterminado? (2)");
        eleccion_p2 = in.nextInt();
        switch (eleccion_p2) {

            case 1:
                if (eleccion_p2 == 1) ;

                System.out.println("Jugador 2");

                System.out.println("Dame tus puntos de salud");
                salud_p1 = in.nextInt();
                while (salud_p2 < 1 || salud_p2 > 200) {
                    System.out.println("Eso no es posible");
                    salud_p2 = in.nextInt();
                }
                atributos_p2 = atributos_p2 + salud_p2;
                valor_p2 = atributos_p2;
                System.out.println("Tienes asignados " + atributos_p2);

                System.out.println("Dame tus puntos de ataque");
                ataque_p2 = in.nextInt();
                while (ataque_p2 < 1 || ataque_p2 > 200) {
                    System.out.println("Eso no es posible");
                    ataque_p2 = in.nextInt();
                }
                atributos_p2 = atributos_p2 + ataque_p2;
                valor_p2 = atributos_p2;
                System.out.println("Tienes asignados " + atributos_p2);

                System.out.println("Dame tus puntos de defensa");
                defensa_p2 = in.nextInt();
                while (defensa_p2 < 1 || defensa_p2 >= 200) {

                    if (atributos_p2 + defensa_p2 == 500) {

                        defensa_p2 = defensa_p2 - 1;

                    }

                    System.out.println("Eso no es posible");
                    defensa_p2 = in.nextInt();
                }
                atributos_p2 = atributos_p2 + defensa_p2;
                valor_p2 = atributos_p2;
                System.out.println("Tienes asignados " + atributos_p2);

                System.out.println("Dame tu velocidad");
                velocidad_p2 = in.nextInt();
                valor_p2 = valor_p2 + velocidad_p2;
                while (velocidad_p2 < 1 || velocidad_p2 > 200 || valor_p2 > 500) {

                    velocidad_p2 = 500 - atributos_p2;
                    velocidad_p2 = in.nextInt();
                }

                System.out.println("Atributos jugador 2");
                System.out.println("Salud:      " + salud_p2);
                System.out.println("Ataque:     " + ataque_p2);
                System.out.println("Defensa:    " + defensa_p2);
                System.out.println("Velocidad:  " + velocidad_p2);


            case 2:
                System.out.println("Que personaje quieres?");
                System.out.println("            Caballero       Mago        Asesino     Clerigo");
                System.out.println("Salud       99              100         50          100");
                System.out.println("Ataque      200             50         200         100");
                System.out.println("Defensa     200             50          50          100");
                System.out.println("Velocidad   1               100         200         100");
                System.out.println("Habilidades Caballero: Reduccion de daño (pasiva)");
                System.out.println("Habilidades Mago: Cañon de cristal (pasiva)");
                System.out.println("Habilidades Asesino: Veneno (pasiva)");
                System.out.println("Habilidades Clerigo: Sanacion (pasiva)");

                System.out.println("Cual quieres entonces, con numeros del 1 al 4, las habilidades se explicaran despues de la seleccion del personaje");
                personaje_p2 = in.nextInt();
                switch (personaje_p2) {

                    case 1:
                        if (personaje_p2 == 1) {

                            System.out.println("Caballero");
                            System.out.println("Recibe un 30% menos de daño");
                            salud_p2 = 99;
                            ataque_p2 = 200;
                            defensa_p2 = 200 + (200*30/100);
                            velocidad_p2 = 1;

                        }
                    case 2:
                        if (personaje_p2 == 2) {

                            System.out.println("Mago");
                            System.out.println("Recibe un 5% mas de daño y hace un 40% mas de daño");
                            salud_p2 = 100;
                            ataque_p2 = 50 + (50*40/100);
                            defensa_p2 = 50 - (50*5/100);
                            velocidad_p2 = 100;

                        }
                    case 3:
                        if (personaje_p2 == 3) {

                            System.out.println("Asesino");
                            System.out.println("En cada turno causa 1 daño");
                            salud_p2 = 50;
                            ataque_p2 = 200;
                            defensa_p2 = 50;
                            velocidad_p2 = 200;

                        }
                    case 4:
                        if (personaje_p2 == 4) {

                            System.out.println("Clerigo");
                            System.out.println("Sanacion causa que se cure el doble de salud");
                            salud_p2 = 100;
                            ataque_p2 = 100;
                            defensa_p2 = 100;
                            velocidad_p2 = 100;

                        }
                }
        }

        if (velocidad_p1 > velocidad_p2) {

            opcion = 1;
            System.out.println("Jugador 1 es mas veloz ejecutando el caso " + opcion);

        } else {

            if (velocidad_p1 < velocidad_p2) {

                opcion = 2;
                System.out.println("Jugador 2 es mas veloz ejecutando el caso " + opcion);

            } else {

                if (velocidad_p1 == velocidad_p2) {

                    opcion = 3;
                    System.out.println("Tienen igual velocidad ejecutando el caso " + opcion);

                }
            }
        }
        System.out.println("La batalla empieza");

        switch (opcion) {

            case 1:
                if (opcion == 1) {
                    while (salud_p1 > 0 && salud_p2 > 0) {

                        rondas++;
                        System.out.println("Ronda " + rondas);

                        Random random = new Random();
                        bono_p1 = random.nextInt(10);
                        bono_p2 = random.nextInt(10);

                        dmg_p1 = (ataque_p1 / defensa_p2) + bono_p1;
                        if (dmg_p1 <= 0) {
                            dmg_p1 = 1;
                        }
                        dmg_p2 = (ataque_p2 / defensa_p1) + bono_p2;

                        if (dmg_p2 <= 0) {
                            dmg_p2 = 1;
                        }

                        if (salud_p2 > 0 && salud_p1 > 0) {

                            System.out.println("Que quieres hacer?");
                            System.out.println("1 = Atacar 2 = Curarse");
                            accion_p1 = in.nextInt();
                            if (accion_p1 != 1){
                                if (accion_p1 !=2){

                                    System.out.println("Vuelve a intentarlo");
                                    accion_p1 = in.nextInt();

                                }
                            }

                            if (personaje_p1==3){

                                System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                salud_p2--;

                            }
                            if (personaje_p2==3){

                                System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                salud_p1--;

                            }

                            switch (accion_p1) {
                                case 1:
                                    if (accion_p1 == 1) {

                                        salud_p2 = salud_p2 - dmg_p1;
                                        System.out.println("Jugador 2 recibe " + dmg_p1 + " de daño");
                                        if (salud_p2 < 0) {

                                            salud_p2 = 0;

                                            System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                            System.out.println("Gana jugador 1");

                                        } else {

                                            System.out.println("La vida restante de jugador 2 es " + salud_p2);

                                        }

                                    }
                                case 2:
                                    if (accion_p1 == 2) {

                                        salud_p1 = salud_p1 + bono_p1;
                                        System.out.println("Te has curado " + bono_p1);
                                        System.out.println("Tu vida es " + salud_p1);

                                    }

                            }
                        }
                    }

                    if (salud_p1 > 0 && salud_p2 > 0) {

                        System.out.println("Que quieres hacer?");
                        System.out.println("1 = Atacar 2 = Curarse");
                        accion_p2 = in.nextInt();
                        if (accion_p2 != 1){
                            if (accion_p2 !=2){

                                System.out.println("Vuelve a intentarlo");
                                accion_p2 = in.nextInt();

                            }
                        }

                        if (personaje_p1==3){

                            System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                            salud_p2--;

                        }
                        if (personaje_p2==3){

                            System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                            salud_p1--;

                        }

                        switch (accion_p2) {
                            case 1:
                                if (accion_p2 == 1) {

                                    salud_p1 = salud_p1 - dmg_p2;
                                    System.out.println("Jugador 1 recibe " + dmg_p2 + " de daño");
                                    if (salud_p1 < 0) {

                                        salud_p1 = 0;

                                        System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                        System.out.println("Gana jugador 2");

                                    } else {

                                        System.out.println("La vida restante de jugador 1 es " + salud_p1);

                                    }

                                }
                            case 2:
                                if (accion_p2 == 2) {

                                    salud_p2 = salud_p2 + bono_p2;
                                    System.out.println("Te has curado " + bono_p2);
                                    System.out.println("Tu vida es " + salud_p2);

                                }

                        }
                    }

                    if (rondas > contador && salud_p2 > 0 && salud_p1 > 0) {
                        turno = in.next();
                        System.out.println("-------------------------------------------");
                        contador++;
                    }

                }

            case 2:
                if (opcion == 2) {
                    while (salud_p1 > 0 && salud_p2 > 0) {

                        rondas++;
                        System.out.println("Rondas " + rondas);

                        Random random = new Random();
                        bono_p1 = random.nextInt(10);
                        bono_p2 = random.nextInt(10);

                        dmg_p1 = (ataque_p1 / defensa_p2) + bono_p1;
                        if (dmg_p1 <= 0) {
                            dmg_p1 = 1;
                        }
                        dmg_p2 = (ataque_p2 / defensa_p1) + bono_p2;

                        if (dmg_p2 <= 0) {
                            dmg_p2 = 1;
                        }

                        if (salud_p1 > 0 && salud_p2 > 0) {

                            System.out.println("Que quieres hacer?");
                            System.out.println("1 = Atacar 2 = Curarse");
                            accion_p2 = in.nextInt();
                            if (accion_p2 != 1){
                                if (accion_p2 !=2){

                                    System.out.println("Vuelve a intentarlo");
                                    accion_p2 = in.nextInt();

                                }
                            }

                            if (personaje_p1==3){

                                System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                salud_p2--;

                            }
                            if (personaje_p2==3){

                                System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                salud_p1--;

                            }

                            switch (accion_p2) {
                                case 1:
                                    if (accion_p2 == 1) {

                                        salud_p1 = salud_p1 - dmg_p2;
                                        System.out.println("Jugador 1 recibe " + dmg_p2 + " de daño");
                                        if (salud_p1 < 0) {

                                            salud_p1 = 0;

                                            System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                            System.out.println("Gana jugador 2");

                                        } else {

                                            System.out.println("La vida restante de jugador 1 es " + salud_p1);

                                        }

                                    }
                                case 2:
                                    if (accion_p2 == 2) {

                                        salud_p2 = salud_p2 + bono_p2;
                                        System.out.println("Te has curado " + bono_p2);
                                        System.out.println("Tu vida es " + salud_p2);

                                    }

                            }

                            if (salud_p1 < 0 && salud_p2 > 0) {
                                salud_p1 = 0;

                                System.out.println("La vide del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                System.out.println("Gana jugador 2");
                            }

                            if (salud_p2 > 0 && salud_p1 > 0) {

                                System.out.println("Que quieres hacer?");
                                System.out.println("1 = Atacar 2 = Curarse");
                                accion_p1 = in.nextInt();
                                if (accion_p1 != 1){
                                    if (accion_p1 !=2){

                                        System.out.println("Vuelve a intentarlo");
                                        accion_p1 = in.nextInt();

                                    }
                                }

                                if (personaje_p1==3){

                                    System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                    salud_p2--;

                                }
                                if (personaje_p2==3){

                                    System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                    salud_p1--;

                                }

                                switch (accion_p1) {
                                    case 1:
                                        if (accion_p1 == 1) {

                                            salud_p2 = salud_p2 - dmg_p1;
                                            System.out.println("Jugador 2 recibe " + dmg_p1 + " de daño");
                                            if (salud_p2 < 0) {

                                                salud_p2 = 0;

                                                System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                                System.out.println("Gana jugador 1");

                                            } else {

                                                System.out.println("La vida restante de jugador 2 es " + salud_p2);

                                            }

                                        }
                                    case 2:
                                        if (accion_p1 == 2) {

                                            salud_p1 = salud_p1 + bono_p1;
                                            System.out.println("Te has curado " + bono_p1);
                                            System.out.println("Tu vida es " + salud_p1);

                                        }

                                }
                            }

                            if (rondas > contador && salud_p2 > 0 && salud_p1 > 0) {
                                turno = in.next();
                                System.out.println("-------------------------------------------");
                                contador++;
                            }
                        }
                    }
                }
            case 3:
                if (opcion == 3) {
                    while (salud_p1 > 0 && salud_p2 > 0) {

                        Random random = new Random();

                        num_random = random.nextInt(10);
                        if (num_random < 5) {

                            rondas++;
                            System.out.println("Rondas " + rondas);

                            bono_p1 = random.nextInt(10);
                            bono_p2 = random.nextInt(10);

                            dmg_p1 = (ataque_p1 / defensa_p2) + bono_p1;
                            if (dmg_p1 <= 0) {
                                dmg_p1 = 1;
                            }
                            dmg_p2 = (ataque_p2 / defensa_p1) + bono_p2;

                            if (dmg_p2 <= 0) {
                                dmg_p2 = 1;
                            }

                            if (salud_p2 > 0 && salud_p1 > 0) {

                                System.out.println("Que quieres hacer?");
                                System.out.println("1 = Atacar 2 = Curarse");
                                accion_p1 = in.nextInt();
                                if (accion_p1 != 1){
                                    if (accion_p1 !=2){

                                        System.out.println("Vuelve a intentarlo");
                                        accion_p1 = in.nextInt();

                                    }
                                }

                                if (personaje_p1==3){

                                    System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                    salud_p2--;

                                }
                                if (personaje_p2==3){

                                    System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                    salud_p1--;

                                }

                                switch (accion_p1) {
                                    case 1:
                                        if (accion_p1 == 1) {

                                            salud_p2 = salud_p2 - dmg_p1;
                                            System.out.println("Jugador 2 recibe " + dmg_p1 + " de daño");
                                            if (salud_p2 < 0) {

                                                salud_p2 = 0;

                                                System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                                System.out.println("Gana jugador 1");

                                            } else {

                                                System.out.println("La vida restante de jugador 2 es " + salud_p2);

                                            }

                                        }
                                    case 2:
                                        if (accion_p1 == 2) {

                                            salud_p1 = salud_p1 + bono_p1;
                                            System.out.println("Te has curado " + bono_p1);
                                            System.out.println("Tu vida es " + salud_p1);

                                        }

                                }
                            }

                            if (salud_p1 > 0 && salud_p2 > 0) {

                                System.out.println("Que quieres hacer?");
                                System.out.println("1 = Atacar 2 = Curarse");
                                accion_p2 = in.nextInt();
                                if (accion_p2 != 1){
                                    if (accion_p2 !=2){

                                        System.out.println("Vuelve a intentarlo");
                                        accion_p2 = in.nextInt();

                                    }
                                }

                                if (personaje_p1==3){

                                    System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                    salud_p2--;

                                }
                                if (personaje_p2==3){

                                    System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                    salud_p1--;

                                }

                                switch (accion_p2) {
                                    case 1:
                                        if (accion_p2 == 1) {

                                            salud_p1 = salud_p1 - dmg_p2;
                                            System.out.println("Jugador 1 recibe " + dmg_p2 + " de daño");
                                            if (salud_p1 < 0) {

                                                salud_p1 = 0;

                                                System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                                System.out.println("Gana jugador 2");

                                            } else {

                                                System.out.println("La vida restante de jugador 1 es " + salud_p1);

                                            }

                                        }
                                    case 2:
                                        if (accion_p2 == 2) {

                                            salud_p2 = salud_p2 + bono_p2;
                                            System.out.println("Te has curado " + bono_p2);
                                            System.out.println("Tu vida es " + salud_p2);

                                        }

                                }

                                if (rondas > contador && salud_p1 > 0 && salud_p2 > 0) {
                                    turno = in.next();
                                    System.out.println("-------------------------------------------");
                                    contador++;
                                }

                            } else {

                                rondas++;
                                System.out.println("Rondas " + rondas);
                                bono_p1 = random.nextInt(10);
                                bono_p2 = random.nextInt(10);

                                dmg_p1 = (ataque_p1 / defensa_p2) + bono_p1;
                                if (dmg_p1 <= 0) {
                                    dmg_p1 = 1;
                                }
                                dmg_p2 = (ataque_p2 / defensa_p1) + bono_p2;

                                if (dmg_p2 <= 0) {
                                    dmg_p2 = 1;
                                }

                                if (salud_p1 > 0 && salud_p2 > 0) {

                                    System.out.println("Que quieres hacer?");
                                    System.out.println("1 = Atacar 2 = Curarse");
                                    accion_p2 = in.nextInt();
                                    if (accion_p2 != 1){
                                        if (accion_p2 !=2){

                                            System.out.println("Vuelve a intentarlo");
                                            accion_p2 = in.nextInt();

                                        }
                                    }

                                    if (personaje_p1==3){

                                        System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                        salud_p2--;

                                    }
                                    if (personaje_p2==3){

                                        System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                        salud_p1--;

                                    }

                                    switch (accion_p2) {
                                        case 1:
                                            if (accion_p2 == 1) {

                                                salud_p1 = salud_p1 - dmg_p2;
                                                System.out.println("Jugador 1 recibe " + dmg_p2 + " de daño");
                                                if (salud_p1 < 0) {

                                                    salud_p1 = 0;

                                                    System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                                    System.out.println("Gana jugador 2");

                                                } else {

                                                    System.out.println("La vida restante de jugador 1 es " + salud_p1);

                                                }

                                            }
                                        case 2:
                                            if (accion_p2 == 2) {

                                                salud_p2 = salud_p2 + bono_p2;
                                                System.out.println("Te has curado " + bono_p2);
                                                System.out.println("Tu vida es " + salud_p2);

                                            }

                                    }
                                    if (salud_p1 < 0 && salud_p2 > 0) {
                                        salud_p1 = 0;

                                        System.out.println("La vide del jugador 2 es " + salud_p2 + "La vida del jugador 1 es " + salud_p1);
                                        System.out.println("Gana jugador 2");
                                    }

                                    if (salud_p2 > 0 && salud_p1 > 0) {

                                        System.out.println("Que quieres hacer?");
                                        System.out.println("1 = Atacar 2 = Curarse");
                                        accion_p1 = in.nextInt();
                                        if (accion_p1 != 1){
                                            if (accion_p1 !=2){

                                                System.out.println("Vuelve a intentarlo");
                                                accion_p1 = in.nextInt();

                                            }
                                        }

                                        if (personaje_p1==3){

                                            System.out.println("Envenenamiento, se le restara 1 de vida al jugador 2");
                                            salud_p2--;

                                        }
                                        if (personaje_p2==3){

                                            System.out.println("Envenenamiento, se le restara 1 de vida al jugador 1");
                                            salud_p1--;

                                        }

                                        switch (accion_p1) {
                                            case 1:
                                                if (accion_p1 == 1) {

                                                    salud_p2 = salud_p2 - dmg_p1;
                                                    System.out.println("Jugador 2 recibe " + dmg_p1 + " de daño");
                                                    if (salud_p2 < 0) {

                                                        salud_p2 = 0;

                                                        System.out.println("La vida del jugador 2 es " + salud_p2 + " La vida del jugador uno es " + salud_p1);
                                                        System.out.println("Gana jugador 1");

                                                    } else {

                                                        System.out.println("La vida restante de jugador 2 es " + salud_p2);

                                                    }

                                                }
                                            case 2:
                                                if (accion_p1 == 2) {

                                                    salud_p1 = salud_p1 + bono_p1;
                                                    System.out.println("Te has curado " + bono_p1);
                                                    System.out.println("Tu vida es " + salud_p1);

                                                }

                                        }
                                    }

                                    if (rondas > contador && salud_p2 > 0 && salud_p1 > 0) {
                                        turno = in.next();
                                        System.out.println("-------------------------------------------");
                                        contador++;
                                    }
                                }
                            }
                        }
                    }
                }
        }
    }
}

