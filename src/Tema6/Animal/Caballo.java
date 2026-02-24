package Tema6.Animal;

public class Caballo extends Animal{
    public String nombre;
    public int edad;

    @Override
    public void comer() {
        System.out.println("munch munch... crunch crunch...");
    }

    @Override
    public void dormir() {
        System.out.println("fff fff... hff hff...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("hff... hff");
    }

    public Caballo(){
        this.nombre="Centella";
        this.edad=5;
    }
    public Caballo(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void coz(){
        System.out.println(nombre + " ha lanzado una coz");
    }
}
