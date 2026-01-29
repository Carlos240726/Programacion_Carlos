package Tema3.String;

public class MyString {

    public static String invertirMayus(String cadena) {
        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida = invertida + cadena.charAt(i);
        }

        return invertida.toUpperCase();
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toUpperCase();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }

        return contador;
    }

    public static String palabraMasLarga(String cadena) {
        String actual = "";
        String mayor = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c != ' ') {
                actual = actual + c;
            } else {
                if (actual.length() > mayor.length()) {
                    mayor = actual;
                }
                actual = "";
            }
        }

        if (actual.length() > mayor.length()) {
            mayor = actual;
        }

        return mayor;
    }

    public static int contarSubcadenas(String cadena, String subcadena) {
        int contador = 0;

        for (int i = 0; i <= cadena.length() - subcadena.length(); i++) {
            if (cadena.substring(i, i + subcadena.length()).equals(subcadena)) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarPalabras(String cadena) {
        int contador = 0;
        boolean dentroPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c != ' ' && !dentroPalabra) {
                contador++;
                dentroPalabra = true;
            } else if (c == ' ') {
                dentroPalabra = false;
            }
        }

        return contador;
    }

    public static String formatearTelefono(String telefono) {
        String codigo = telefono.substring(0, 2);
        String resto = telefono.substring(2);

        return "(+" + codigo + ")-" + resto;
    }

    public static void histogramaVocales(String cadena) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        cadena = cadena.toLowerCase();

        for (int j = 0; j < cadena.length(); j++) {
            char c = cadena.charAt(j);

            if (c == 'a') a++;
            else if (c == 'e') e++;
            else if (c == 'i') i++;
            else if (c == 'o') o++;
            else if (c == 'u') u++;
        }

        System.out.println("a " + a);
        System.out.println("e " + e);
        System.out.println("i " + i);
        System.out.println("o " + o);
        System.out.println("u " + u);
    }

    public static void main(String[] args) {
        String texto = "Hola a todos";

        System.out.println("Invertida y mayus: " + invertirMayus(texto));
        System.out.println("Vocales: " + contarVocales(texto));
        System.out.println("Palabra más larga: " + palabraMasLarga(texto));
        System.out.println("Veces 'o': " + contarSubcadenas(texto, "o"));
        System.out.println("Número de palabras: " + contarPalabras(texto));
        System.out.println("Teléfono formateado: " + formatearTelefono("34555332211"));
        System.out.println("Histograma de vocales:");
        histogramaVocales(texto);
    }
}
