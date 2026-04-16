package Tema7.Funkos;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Funkos {
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

        File archivo = new File("src/Tema7/Funkos/funkos.csv");
        File archivoTemporal = new File("src/Tema7/Funkos/funkostemp.csv");

        String cod = "";
        String linea;
        String[] contenido;
        String modelo;
        String anio;
        String fecha;
        String fechaExacta[];
        String nombre;
        String completo;

        int opcion;
        int contador=0;

        double precio = 0;
        double precio_maximo = 0;
        double media;

        Scanner in = new Scanner(System.in);



        System.out.println("Que quieres hacer?");
        menu();
        opcion = in.nextInt();
        switch (opcion) {
            case 1:
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

                completo= cod + "," + nombre + "," + modelo + "," + precio + "," + fecha;

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))){
                    bw.newLine();
                    bw.write(completo);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

                break;
            case 2:
                System.out.println("Ingresa el código del funko a borrar:");
                in.nextLine();
                String codigoABorrar = in.nextLine();

                try (BufferedReader br = new BufferedReader(new FileReader(archivo));
                     BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

                    while ((linea = br.readLine()) != null) {
                        contenido = linea.split(",");
                        if (!contenido[0].equals(codigoABorrar)) {
                            bw.write(linea);
                            bw.newLine();
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (archivo.delete()) {
                    archivoTemporal.renameTo(archivo);
                    System.out.println("Funko eliminado con éxito.");
                } else {
                    System.out.println("No se pudo eliminar el archivo original.");
                }
                break;
            case 3:
                try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                    linea=br.readLine();
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                break;
            case 4:
                try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                    linea=br.readLine();
                    while ((linea = br.readLine()) != null) {
                        contenido=linea.split(",");
                        precio=Double.parseDouble(contenido[3]);
                        if (precio_maximo<precio){
                            precio_maximo=precio;
                            cod=contenido[0];
                        }
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

                System.out.println("El funko mas caro es aquel con codigo " + cod);
                break;
            case 5:
                try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                    linea=br.readLine();
                    while ((linea = br.readLine()) != null) {
                        contenido=linea.split(",");
                        precio=precio + Double.parseDouble(contenido[3]);
                        contador++;
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                media=precio/contador;
                System.out.println("La media de precio es " + media);
                break;
            case 6:
                try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                    linea=br.readLine();
                    while ((linea = br.readLine()) != null) {
                        contenido=linea.split(",");
                        modelo=contenido[2];
                        cod=contenido[0];
                        modelos.put(cod,modelo);
                        contador++;
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                modelos.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
                break;
            case 7:
                try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                    linea=br.readLine();
                    while ((linea = br.readLine()) != null) {
                        contenido=linea.split(",");
                        fecha=contenido[4];
                        fechaExacta=fecha.split("-");
                        anio=fechaExacta[0];
                        if (anio.equals("2023")) {
                            cod=contenido[0];
                            System.out.println("El funko " + contenido[1] + " con codigo " +  contador + " es de 2023");
                        }
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                break;
            case 0:
                break;
        }
    }
}
