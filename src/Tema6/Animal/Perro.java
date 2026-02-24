package Tema6.Animal;

public class Perro extends Animal{
    public String nombre;
    public int edad;

    @Override
    public void comer() {
        System.out.println("chomp chomp... slurp... ñac ñac...");
    }

    @Override
    public void dormir() {
        System.out.println("fff fff... rrr... frr...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau! Woof! Woof!");
    }

    public Perro(){
        this.nombre="Ares";
        this.edad=2;
    }
    public Perro(String nombre, int edad){
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
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void lanzarPelota(){
        System.out.println(nombre + " esta corriendo la pelota");
    }
}
