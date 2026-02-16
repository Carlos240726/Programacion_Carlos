package Tema5.Compra;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CompraEjercicio4 {
    public static void main(String[] args){
        LinkedHashSet<String> listaCompra = new LinkedHashSet<>();
        LinkedHashSet<String> carritoCompra = new LinkedHashSet<>();
        Scanner in = new Scanner(System.in);

        boolean verificacion = true;
        int opcion = 0;
        String valor = "";

        while (verificacion){
            mostrarMenu();
            opcion = in.nextInt();
            in.nextLine();

            while (opcion < 0 || opcion > 5){
                System.out.println("Valor no válido, vuelve a intentarlo");
                opcion = in.nextInt();
                in.nextLine();
            }

            switch (opcion){
                case 0:
                    System.out.println("Introduce lo que quieres añadir a la lista de la compra:");
                    valor = in.nextLine();
                    if (listaCompra.contains(valor)){
                        System.out.println("El producto ya existe en la lista");
                    } else {
                        listaCompra.add(valor);
                        System.out.println("Producto añadido a la lista de la compra");
                    }
                    break;

                case 1:
                    System.out.println("Introduce el producto que quieres añadir al carrito:");
                    valor = in.nextLine();
                    if (carritoCompra.contains(valor)){
                        System.out.println("El producto ya está en el carrito");
                    } else {
                        carritoCompra.add(valor);
                        System.out.println("Producto añadido al carrito");
                    }
                    break;

                case 2:
                    System.out.println("PRODUCTOS EN EL CARRITO");
                    if (carritoCompra.isEmpty()){
                        System.out.println("El carrito está vacío");
                    } else {
                        for (String producto : carritoCompra){
                            System.out.println("- " + producto);
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("PRODUCTOS QUE FALTAN POR AÑADIR");
                    LinkedHashSet<String> productosFaltantes = new LinkedHashSet<>(listaCompra);
                    productosFaltantes.removeAll(carritoCompra);
                    if (productosFaltantes.isEmpty()){
                        System.out.println("¡Has añadido todos los productos de la lista al carrito!");
                    } else {
                        for (String producto : productosFaltantes){
                            System.out.println("- " + producto);
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("=== PRODUCTOS COMPLETADOS ===");
                    LinkedHashSet<String> productosCompletados = new LinkedHashSet<>(listaCompra);
                    productosCompletados.retainAll(carritoCompra);
                    if (productosCompletados.isEmpty()){
                        System.out.println("Aún no has añadido ningún producto de la lista al carrito");
                    } else {
                        for (String producto : productosCompletados){
                            System.out.println("- " + producto);
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("RESUMEN FINAL");
                    System.out.println("Lista de la compra: " + listaCompra);
                    System.out.println("Carrito: " + carritoCompra);
                    System.out.println("Finalizando proceso...");
                    verificacion = false;
                    break;
            }
        }
    }

    public static void mostrarMenu(){
        System.out.println("===== MENÚ DE COMPRA =====");
        System.out.println("0 - Añadir producto a la lista de la compra");
        System.out.println("1 - Añadir producto al carrito");
        System.out.println("2 - Mostrar productos en el carrito");
        System.out.println("3 - Mostrar productos que faltan por añadir");
        System.out.println("4 - Mostrar productos completados (en lista y en carrito)");
        System.out.println("5 - Finalizar");
        System.out.print("Elige una opción: ");
    }
}