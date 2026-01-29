package Tema4.EjercicioPresentacion;

public class Persona {
    String nombre;
    int edad;

    public int getEdad;
    public String getNombre;

    static final int edadDefecto=0;

    public void setNombre(String getNombre){
        this.nombre=getNombre;
    }
    public void setNombreEdad(String getNombre,int getEdad){
        if (getEdad<=0){
            this.edad=0;
        }
        this.nombre=getNombre;
    }
    public void saludar(){
        System.out.println("¡Hola!");
    }
    public void presentarme(){
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
    public void saludarA(String nombre){
        System.out.println("¡Hola " + nombre + "!");
    }
    public void showInfo(){
        System.out.println("El nombre es: " + nombre + "\n la edad es:" + edad + " años.");
    }
}
