package Tema1;

public class Tema1ejercicio5 {
    public static void main(String[] args) {
        double num1 = 24 % 5;                                        //guarda el resultado en num1
        System.out.println("24 % 5");
        System.out.println("resultado 1 = " + num1);                //muestra por pantalla la variable num1
        //todo esto se puede acortar con System.out.println(operacion)
        num1 = 7/2 + 2.5;
        System.out.println("7/2 + 2.5");
        System.out.println("resultado 2 = " + num1);

        num1 = 10.8/2 + 2;
        System.out.println("10.8 / 2 + 2");
        System.out.println("resultado 3 = " + num1);

        num1 = ( 4 + 6 ) * 3 + 2 * ( 5 - 1 );
        System.out.println("( 4 + 6 ) * 3 + 2 * ( 5 - 1 )");
        System.out.println("resultado 4 = " + num1);

        num1 = 5 / 2 + 17 % 3;
        System.out.println("5 / 2 + 17 % 3");
        System.out.println("resultado 5 = " + num1);

        boolean num2 = 7 >= 5 || 27 != 8;
        System.out.println("7 >= 5 OR 27 <> 8");
        System.out.println("resultado 6 = " + num2);

        num2 = (45 <= 7) || ! ( 5 >= 7 );
        System.out.println("(45 <= 7) OR NOT ( 5 >= 7 )");
        System.out.println("resultado 7 = " + num2);

        num1 = 27 % 4 + 15 / 4;
        System.out.println("27 % 4 + 15 / 4");
        System.out.println("resultado 8 = " + num1);

        num1 = 37 / 4 * 4 - 2;
        System.out.println("37 / 4 * 4 - 2");
        System.out.println("resultado 9 = " + num1);

        num2 = (25 >= 7) && ! (7 <=2);
        System.out.println("(25 >= 7) AND NOT (7 <=2)");
        System.out.println("resultado 10 = " + num2);

        num2 = ('H' < 'J') && ('9' != '7');
        System.out.println("('H' < 'J') && ('9' <> '7')");
        System.out.println("resultado 11 = " + num2);

        num2 = 25 > 20 && 13 > 5;
        System.out.println("25 > 20 && 13 > 5");
        System.out.println("resultado 12 = " + num2);

        num2 = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2;
        System.out.println("10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2");
        System.out.println("resultado 13 = " + num2);

        num2 = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println("4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1");
        System.out.println("resultado 14 = " + num2);

        num2 = 10 <= 2 * 5 && 3 < 4 || ! (8>7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("10 <= 2 * 5 && 3 < 4 || ! (8>7) && 3 * 2 <= 4 * 2 - 1");
        System.out.println("resultado 15 = " + num2);
    }
}
