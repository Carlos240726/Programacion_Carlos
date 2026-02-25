package Tema5.Registro;

import java.util.*;

public class Main {
    public static void menu() {
        System.out.println("1. Añadir avistamiento");
        System.out.println("2. Mostrar avistamientos a partir de las 8");
        System.out.println("3. Mostrar avistamientos nocturnos");
        System.out.println("4. Mostrar manadas");
        System.out.println("5. Mostrar serpientes");
        System.out.println("6. Mostrar pajaros");
        System.out.println("0. Salir");
    }

    public static void menuAnadir() {
        System.out.println("1. Serpiente");
        System.out.println("2. Pajaro");
        System.out.println("3. Lobo");
    }

    public static void main(String[] args) {
        List<RegistroBase> registro = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        int caso;
        int hora;
        int cantidad;
        double longitud;
        double peso;
        String especie;
        String observaciones;

        while (continuar) {
            System.out.println("¿Qué quieres hacer?");
            menu();
            caso = in.nextInt();

            switch (caso) {
                case 0:
                    continuar = false;
                    break;

                case 1:
                    menuAnadir();
                    int tipoAnimal = in.nextInt();
                    in.nextLine();

                    switch (tipoAnimal) {
                        case 1:
                            System.out.println("Especie:");
                            especie = in.nextLine();
                            System.out.println("Hora:");
                            hora = in.nextInt();
                            System.out.println("Longitud:");
                            longitud = in.nextDouble();
                            registro.add(new Serpiente(especie, hora, longitud));
                            break;

                        case 2:
                            System.out.println("Especie:");
                            especie = in.nextLine();
                            System.out.println("Hora:");
                            hora = in.nextInt();
                            System.out.println("Peso:");
                            peso = in.nextDouble();
                            registro.add(new Pajaro(especie, hora, peso));
                            break;

                        case 3:
                            System.out.println("Observaciones:");
                            observaciones = in.nextLine();
                            System.out.println("Hora:");
                            hora = in.nextInt();
                            System.out.println("Cantidad de lobos:");
                            cantidad = in.nextInt();
                            registro.add(new ManadaLobos(observaciones, hora, cantidad));
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                    System.out.println("Avistamientos a partir de las 8:");
                    for (RegistroBase r : registro) {
                        if (r.getHora() >= 8) {
                            System.out.println(r);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Avistamientos nocturnos (entre las 20 y las 8):");
                    for (RegistroBase r : registro) {
                        if (r.getHora() >= 20 || r.getHora() < 8) {
                            System.out.println(r);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Manadas de lobos:");
                    for (RegistroBase r : registro) {
                        if (r instanceof ManadaLobos) {
                            System.out.println(r);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Serpientes:");
                    for (RegistroBase r : registro) {
                        if (r instanceof Serpiente) {
                            System.out.println(r);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Pájaros:");
                    for (RegistroBase r : registro) {
                        if (r instanceof Pajaro) {
                            System.out.println(r);
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        in.close();
    }
}
