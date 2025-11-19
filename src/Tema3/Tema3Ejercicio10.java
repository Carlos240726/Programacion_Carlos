package Tema3;

import java.util.Scanner;


public class Tema3Ejercicio10 {
    public static void main(String[] args){

        System.out.println("Que quieres hacer? (Pon solo el numero)");
        System.out.println("1. Muestra el signo de un número introducido por el usuario");
        System.out.println("2. Indica si el usuario es mayor de edad o no");
        System.out.println("3. Calcula el área y perímetro de un círculo.");
        System.out.println("4. Conversor de euros a dólares y de dólares a euros.");
        System.out.println("5. Mostrar tabla de multiplicar de un número.");
        System.out.println("6. Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("7. Comprobador de números primos.");
        System.out.println("8. Comprobador de fechas.");
        System.out.println("9. Dibujar triángulos.");

        Scanner in = new Scanner(System.in);
        int opcion = in.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Dame un numero");
                int numero = in.nextInt();

                int resultado = Tema3Ejercicio1.numberSing(numero);

                switch (resultado){
                    case 0:
                        if (resultado==0) {
                            System.out.println("El numero recibido es 0");
                        }
                    case -1:
                        if (resultado==-1){
                            System.out.println("El numero recibido es negativo");
                        }
                    case 1:
                        if (resultado==1){
                            System.out.println("El numero recibido es positivo");
                        }
                }
                break;

            case 2:
                System.out.println("Dame un numero");
                numero = in.nextInt();

                resultado = Tema3Ejercicio1.numberSing(numero);

                System.out.println(resultado);

                switch (resultado){

                    case 0:
                        if (resultado==0) {
                            System.out.println("El numero recibido es 0");
                        }
                    case -1:
                        if (resultado==-1){
                            System.out.println("El numero recibido es negativo");
                        }
                    case 1:
                        if (resultado==1){
                            System.out.println("El numero recibido es positivo");
                        }
                }

                System.out.println("Dame otro numero");
                int edad = in.nextInt();
                boolean age = Tema3Ejercicio2.isAdult(edad);

                if (age==true){
                    System.out.println("Es mayor de edad");
                }
                if (age==false){
                    System.out.println("Es menor de edad");
                }
                break;


            case 3:

                System.out.println("Dame un radio");
                int radio = in.nextInt();
                boolean verificacion = Tema3Ejercicio3.validRadius(radio);

                if (verificacion == true){

                    double perimetro = Tema3Ejercicio3.calculateCirclePerimeter(radio);
                    System.out.println("El perimetro es " + perimetro);

                    double area = Tema3Ejercicio3.calculateCircleArea(radio);
                    System.out.println("El area es " + area);
                }
                break;


            case 4:

                int proceso;
                double euro=0;
                double dolar=0;

                System.out.println("Que divisa tienes, € o $? (1 = €) (2 = $)");
                proceso = in.nextInt();
                if (proceso != 1){
                    if (proceso != 2){
                        proceso = in.nextInt();
                    }
                }
                System.out.println("Dame una cantidad de dinero");
                if (proceso == 1){
                    euro = in.nextDouble();
                    System.out.println("Ahora te lo pasaremos a dolares");
                    double euro2dolar = Tema3Ejercicio4.cambioDivisa(proceso,euro,dolar);
                    System.out.println("De € a $ es " + euro2dolar);
                } else if (proceso == 2) {
                    dolar = in.nextDouble();
                    System.out.println("Ahora te lo pasaremos a euros");
                    double dolar2euro = Tema3Ejercicio4.cambioDivisa(proceso,euro,dolar);
                    System.out.println("De € a $ es " + dolar2euro);
                }
                break;


            case 5:
                System.out.println("Dame un numero del 1 al 10");
                numero = in.nextInt();
                while (numero<1 || numero>10){
                    System.out.println("ese numero no es posible");
                }
                Tema3Ejercicio5.multiplicar(numero);
                break;

            case 6:
                System.out.println("Mostrando las tablas de multiplicar del 1 al 10");

                int contador=1;
                while (contador<=10){
                    Tema3Ejercicio5.multiplicar(contador);
                    System.out.println("-------------------------------------");
                    contador++;
                }
                break;


            case 7:

                verificacion=true;
                numero = 0;
                while (verificacion==true){
                    System.out.println("Dame un numero y te dire si es primo o no, si pones 0 se acaba");
                    numero = in.nextInt();
                    while (numero<0){
                        System.out.println("Eso no es posible, introduzca un nuevo numero");
                        numero = in.nextInt();
                    }
                    if (numero==0){
                        verificacion=false;
                    }
                    Tema3Ejercicio7.primos(numero);
                }
                break;


            case 8:
                System.out.println("Dame un dia (1-31)");
                int dia = in.nextInt();

                while (dia < 1 || dia > 31){
                    dia = in.nextInt();
                }

                System.out.println("Dame un mes (1-12)");
                int mes = in.nextInt();

                while (mes < 1 || mes > 12){
                    mes = in.nextInt();
                }
                System.out.println("Dame un año");
                int year = in.nextInt();

                Tema3Ejercicio8.fecha(dia, mes, year);
                break;

            case 9:
                System.out.println("Dame un caracter para la piramide");
                char caracter = in.next().charAt(0);
                System.out.println("Dime cuantos escalones quieres");
                int escalones = in.nextInt();

                Tema3Ejercicio9.piramide(caracter,escalones);
                break;
        }
    }
}
