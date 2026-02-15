package Tema5.Excepciones.Gato;

public class Main {

    public static void main(String[] args) {

        System.out.println("PRUEBA 1: Constructor por defecto");
        try {
            Gato gato1 = new Gato();
            System.out.println(gato1);
            System.out.println("Gato creado correctamente\n");


        System.out.println(" PRUEBA 2: Constructor con valores válidos ");

            Gato gato2 = new Gato(5, "Pelusa");
            System.out.println(gato2);
            System.out.println("Gato creado correctamente\n");


        System.out.println(" PRUEBA 3: Constructor con edad negativa ");

            Gato gato3 = new Gato(-2, "Garfield");
            System.out.println(gato3);
            System.out.println("Gato creado correctamente\n");

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage() + "\n");
        }
    }
}
