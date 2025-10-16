package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args){
        int contador = 0;
        int suma = 0;

        while (contador < 1001){
            suma = suma + contador;
            contador++;
        }
        System.out.println("El total es " + suma);
    }
}
