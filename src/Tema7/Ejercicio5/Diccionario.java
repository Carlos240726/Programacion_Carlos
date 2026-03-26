package Tema7.Ejercicio5;
import java.io.*;

public class Diccionario {
    public static void main(String[] args) throws IOException {
        String rutalectura = "src/Tema7/Ejercicio5/diccionario.txt";
        File carpeta = new File("src/Tema7/Ejercicio5/Diccionario");
        String[] secciones = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};

        carpeta.mkdir();

        BufferedWriter[] writers = new BufferedWriter[secciones.length];
        for (int i = 0; i < secciones.length; i++) {
            File archivo = new File(carpeta + "/" + secciones[i].toUpperCase() + ".txt");
            writers[i] = new BufferedWriter(new FileWriter(archivo));
        }

        try (BufferedReader br = new BufferedReader(new FileReader(rutalectura))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < secciones.length; i++) {
                    if (line.toLowerCase().startsWith(secciones[i])) {
                        writers[i].write(line);
                        writers[i].newLine();
                        break;
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (BufferedWriter bw : writers) bw.close();
    }
}