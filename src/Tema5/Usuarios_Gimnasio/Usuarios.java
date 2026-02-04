package Tema5.Usuarios_Gimnasio;

public class Usuarios {
    private String nombre;
    private int edad;


    public Usuarios(){
        this.edad=20;
        this.nombre="Manolo";
    }
    public Usuarios(int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }


    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad:   "+ edad);
        return "";
    }
}
