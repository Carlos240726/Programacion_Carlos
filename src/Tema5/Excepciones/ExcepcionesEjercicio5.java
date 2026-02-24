package Tema5.Excepciones;

import java.util.*;

public class ExcepcionesEjercicio5 {

    public static void imprimirPositivo(int numero) throws InvalidNumeroException{
        if (numero < 0){
            throw new InvalidNumeroException("El valor no es positivo");
        }
        System.out.println("El número " + numero + " es positivo");
    }

    public static void imprimirNegativo(int numero) throws InvalidNumeroException{
        if (numero > 0){
            throw new InvalidNumeroException("El valor no es negativo");
        }
        System.out.println("El número " + numero + " es negativo");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numero;
        int opcion;

        try {
            System.out.println("Introduce un numero");
            numero = in.nextInt();
            System.out.println("Quieres comprobar positivo(0) o negativo(1)");
            opcion = in.nextInt();

            while (opcion != 0 && opcion != 1){
                System.out.println("Opcion no valida, vuelve a intentarlo");
                opcion = in.nextInt();
            }

            switch (opcion){
                case 0:
                    imprimirPositivo(numero);
                    break;
                case 1:
                    imprimirNegativo(numero);
                    break;
            }
        } catch (InvalidNumeroException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error: Debes introducir un número entero");
        }
    }
}
class InvalidNumeroException extends Exception {
    public InvalidNumeroException(String mensaje) {
        super(mensaje);
    }
}