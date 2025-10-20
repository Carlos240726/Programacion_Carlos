package Tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {

        int numero = 1;
        int primos = 0;
        int divisor = numero;
        int valores = 0;
        int resto = 0;

        while (primos < 20){
            divisor = numero;
            valores = 0;
            while (divisor>0){
                resto = numero%divisor;
                divisor--;
                if (resto == 0){
                    valores++;
                }
            }
                if (valores <=2){
                    System.out.println(numero);
                    primos++;
                }
                numero++;
        }
    }
}
