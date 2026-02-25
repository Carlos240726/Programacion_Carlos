package Tema5.Acortador_URL;

import java.util.*;

public class AcortadorURL {

    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int LONGITUD_CLAVE = 5;

    public static String generarClave(Map<String, String> mapa) {
        Random random = new Random();
        String clave;
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < LONGITUD_CLAVE; i++) {
                sb.append(CARACTERES.charAt(random.nextInt(CARACTERES.length())));
            }
            clave = sb.toString();
        } while (mapa.containsKey(clave));
        return clave;
    }

    public static void menu() {
        System.out.println("\n=== Acortador de URLs ===");
        System.out.println("1. Crear nuevo registro");
        System.out.println("2. Resolver dirección");
        System.out.println("3. Borrar registro");
        System.out.println("4. Mostrar todos los registros");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) {
        Map<String, String> acortador = new HashMap<>();
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            menu();
            int opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 0:
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                    break;

                case 1:
                    System.out.print("Introduce la URL: ");
                    String url = in.nextLine();
                    String clave = generarClave(acortador);
                    acortador.put(clave, url);
                    System.out.println("URL acortada creada:");
                    System.out.println("  Clave:  " + clave);
                    System.out.println("  Enlace: https://acortar.link/" + clave);
                    break;

                case 2:
                    System.out.print("Introduce la clave a resolver: ");
                    String claveResolver = in.nextLine();
                    if (acortador.containsKey(claveResolver)) {
                        System.out.println("URL encontrada: " + acortador.get(claveResolver));
                    } else {
                        System.out.println("Error: la clave '" + claveResolver + "' no existe.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce la clave a borrar: ");
                    String claveBorrar = in.nextLine();
                    if (acortador.containsKey(claveBorrar)) {
                        acortador.remove(claveBorrar);
                        System.out.println("Registro '" + claveBorrar + "' eliminado correctamente.");
                    } else {
                        System.out.println("Error: la clave '" + claveBorrar + "' no existe.");
                    }
                    break;

                case 4:
                    if (acortador.isEmpty()) {
                        System.out.println("No hay registros almacenados.");
                    } else {
                        System.out.println("Registros almacenados");
                        for (Map.Entry<String, String> entrada : acortador.entrySet()) {
                            System.out.println("  https://acortar.link/" + entrada.getKey() + "  ->  " + entrada.getValue());
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        in.close();
    }
}
