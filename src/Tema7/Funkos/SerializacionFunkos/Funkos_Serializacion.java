package Tema7.Funkos.SerializacionFunkos;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Funkos_Serializacion implements Serializable{
        public static void menu() {
            System.out.println("1. Añadir funko");
            System.out.println("2. Borrar funko");
            System.out.println("3. Mostrar todos los funkos");
            System.out.println("4. Mostrar funko mas caro");
            System.out.println("5. Mostrar media de precios");
            System.out.println("6. Mostrar funkos agrupados por modelos");
            System.out.println("7. Mostrar funkos de 2023");
            System.out.println("0. Salir");
        }
        public static void main(String[] args) {
            Map<String, String> modelos = new HashMap<>();
            ArrayList<Funko> lista = new ArrayList<>();


            File archivo = new File("src/Tema7/Funkos/funkos.csv");
            File archivoTemporal = new File("src/Tema7/Funkos/SerializacionFunkos/Funkos.dat");

            String cod = "";
            String modelo;
            String fecha;
            String nombre;

            int opcion;
            int contador=0;

            double precio = 0;
            double precio_maximo = 0;
            double media;

            boolean continuar=true;

            Scanner in = new Scanner(System.in);



            System.out.println("Que quieres hacer?");
            menu();
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    while (continuar) {
                        System.out.println("Ingresa el codigo del funko a añadir");
                        in.nextLine();
                        cod = in.nextLine();
                        System.out.println("Ingresa el nombre del funko");
                        nombre=in.nextLine();
                        System.out.println("Dime el modelo del funko");
                        modelo = in.nextLine();
                        System.out.println("Dime el precio del funko");
                        precio = in.nextDouble();
                        in.nextLine();
                        System.out.println("Dime la fecha de lanzamiento del funko, formaro YYYY/MM/DD");
                        fecha = in.nextLine();

                        lista.add(new Funko(cod,nombre,modelo,precio,fecha));

                        System.out.println("Quieres parar de añadir funkos? (0) = Si | (1) = No");
                        opcion = in.nextInt();
                        if (opcion == 1) {
                            continuar = true;
                        }else  if (opcion == 0) {
                            continuar = false;
                        }else {
                            continuar = true;
                        }
                    }


                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoTemporal, true))){
                        oos.writeObject(lista);
                        System.out.println("Lista guardada correctamente en funkos.dat");
                        System.out.println("Funkos almacenados: " + lista.size());
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("Ingresa el código del funko a borrar:");
                    in.nextLine();
                    cod = in.nextLine();

                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTemporal))) {
                        lista = (ArrayList<Funko>) ois.readObject();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    String finalCod = cod;
                    lista.removeIf(funko -> funko.getCodigo().equals(finalCod));

                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoTemporal))) {
                        oos.writeObject(lista);
                        System.out.println("Funko eliminado con éxito.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTemporal))) {
                        lista = (ArrayList<Funko>) ois.readObject();
                        System.out.println("=== Funkos almacenados (" + lista.size() + ") ===");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i));
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTemporal))) {
                        lista = (ArrayList<Funko>) ois.readObject();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    for (Funko funko : lista) {
                        if (funko.getPrecio() > precio_maximo) {
                            precio_maximo = funko.getPrecio();
                            cod = funko.getCodigo();
                        }
                    }

                    System.out.println("El funko mas caro es aquel con codigo " + cod);
                    break;
                case 5:

                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTemporal))) {
                        lista = (ArrayList<Funko>) ois.readObject();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    for (Funko funko : lista) {
                        precio=precio+funko.getPrecio();
                        contador++;
                    }
                    media=precio/contador;
                    System.out.println("La media de precio es " + media);
                    break;
                case 6:
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTemporal))) {
                        lista = (ArrayList<Funko>) ois.readObject();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    for (Funko funko : lista) {
                        modelos.put(funko.getCodigo(), funko.getModelo());
                    }

                    modelos.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue())
                            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
                    break;
                case 7:
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoTemporal))) {
                        lista = (ArrayList<Funko>) ois.readObject();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }

                    for (Funko funko : lista) {
                        if(funko.getFecha().startsWith("2023")){
                            System.out.println("El funko " + funko.getNombre() + " con codigo " + funko.getCodigo() + " es de 2023");
                        }
                    }
                    break;
                case 0:
                    break;
            }
    }
}
