package Tema5.Excepciones.Gato;

public class Gato {
    private String nombre;
    private int edad;

    public Gato() throws Exception {
        this.edad = 2;
        this.nombre = "Miau";
    }

    public Gato(int edad, String nombre) throws Exception {
        setEdad(edad);
        setNombre(nombre);
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() <= 3) {
            throw new Exception("El nombre debe tener más de 3 caracteres");
        }
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
}