package Tema5.Banco;

public class Usuarios {
    private String nombre;
    private String dni;
    private int edad;
/*Constructores*/
    public Usuarios(){
        this.nombre="Manolo";
        this.dni="11111111L";
        this.edad=52;
    }
    public Usuarios(String nombre, String dni, int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }
/*gets*/
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public String getDni() {return dni;}
/*sets*/
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setDni(String dni) {this.dni = dni;}
/*to String*/
    public String toString() {
        System.out.println("Nombre:     " + nombre);
        System.out.println("Edad:       " + edad);
        System.out.println("DNI:        " + dni);
        return "";
    }
}
