package Tema4.Hero;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero();
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        boolean combate=true;

        String nombre;

        int salud;
        int saludMaxima;
        int ataque;
        int defensa;

        int valor=0;

        System.out.println("Dime tu nombre");
        nombre= in.next();
        hero.getName(nombre);

        System.out.println("Dime tus puntos de salud actuales");
        salud=in.nextInt();
        hero.getHealth(salud);
        System.out.println("Dime tus puntos de salud maxima");
        saludMaxima=in.nextInt();
        hero.getMaxHealth(saludMaxima);
        System.out.println("Dime tus puntos de ataque");
        ataque=in.nextInt();
        hero.getAttack(ataque);
        System.out.println("Dime tus puntos de defensa");
        defensa=in.nextInt();
        hero.getDefense(defensa);

        while (hero.heroAlive){

            int enemigoSalud = 3;
            int enemigoAtaque = 1;
            int enemigoDefensa = 1;

            int enemigo2Salud = 3;
            int enemigo2Ataque = 1;
            int enemigo2Defensa = 1;

            int enemigo3Salud = 3;
            int enemigo3Ataque = 1;
            int enemigo3Defensa = 1;

            hero.toString();

            int huida;
            int hordas=0;
            int cantidadEnemigos= random.nextInt(3);
            int turno=1;


            cantidadEnemigos=cantidadEnemigos+1;

            System.out.println("La cantidad de enemigos de esta ronda es de " + cantidadEnemigos);

            switch (cantidadEnemigos){
                case 1:
                    System.out.println("Te has encontrado con un goblin, preparate para el combate");
                    while (combate){
                        huida= random.nextInt(10);
                        if (huida==cantidadEnemigos){
                            System.out.println("El enemigo a huido");
                            combate=false;
                        }
                        enemigoSalud=hero.attackHero(enemigoDefensa,enemigoSalud);
                        if (enemigoSalud<=0){
                            combate=false;
                        }
                        hero.attackEnemy(enemigoAtaque);
                        hordas++;
                        break;
                    }
                case 2:
                    System.out.println("Te has encontrado con un goblin y un slime, preparate para el combate");
                    while (combate){
                        huida= random.nextInt(10);
                        if (huida==cantidadEnemigos){
                            huida= random.nextInt(2)+1;

                            System.out.println("El enemigo" + huida +"huido");
                            if (huida==1){
                                enemigoSalud=0;
                            }else {
                                enemigo2Salud=0;
                            }
                        }
                        System.out.println("A que enemigo quieres atacar? (goblin=1) (slime=2)");
                        valor=in.nextInt();
                        while (valor!=1 && valor!=2){
                            System.out.println("Valor incorrecto, vuelve a introducir un valor");
                            valor=in.nextInt();
                        }
                        if (valor==1){
                            enemigoSalud=hero.attackHero(enemigoDefensa,enemigoSalud);
                        }else {
                            enemigo2Salud=hero.attackHero(enemigo2Defensa,enemigo2Salud);
                        }
                        if (enemigoSalud<=0&&enemigo2Salud<=0){
                            combate=false;
                        }
                        hero.attackEnemy(enemigoAtaque);
                        hero.attackEnemy(enemigo2Ataque);
                        hordas++;
                        break;
                    }
                case 3:
                    System.out.println("Te has encontrado con un goblin, un slime y un kobold, preparate para el combate");
                    while (combate){
                        huida= random.nextInt(10);
                        if (huida==cantidadEnemigos){
                            huida= random.nextInt(2)+1;

                            System.out.println("El enemigo" + huida +"huido");
                            if (huida==1){
                                enemigoSalud=0;
                            }else if (huida==2){
                                enemigo2Salud=0;
                            }else {enemigo3Salud=0;}
                        }
                        System.out.println("A que enemigo quieres atacar? (goblin=1) (slime=2) (kobold=3)");
                        valor=in.nextInt();
                        while (valor!=1 && valor!=2&&valor!=3){
                            System.out.println("Valor incorrecto, vuelve a introducir un valor");
                            valor=in.nextInt();
                        }
                        if (valor==1){
                            enemigoSalud=hero.attackHero(enemigoDefensa,enemigoSalud);
                        }else if (valor==2) {
                            enemigo2Salud=hero.attackHero(enemigo2Defensa,enemigo2Salud);
                        }else {
                            enemigo3Salud=hero.attackHero(enemigo3Defensa,enemigo3Salud);
                        }
                        if (enemigoSalud<=0&&enemigo2Salud<=0&&enemigo3Salud<=0){
                            combate=false;
                        }
                        hero.attackEnemy(enemigoAtaque);
                        hero.attackEnemy(enemigo2Ataque);
                        hero.attackEnemy(enemigo3Ataque);
                        hordas++;
                        break;
                    }
                    combate=true;
                    valor=random.nextInt(1000);
                    if (valor==1){
                        hero.rest();
                    }
                    valor=random.nextInt(100);
                    if (valor==2){
                        hero.drinkPotion();
                    }
            }
        }
    }
}
