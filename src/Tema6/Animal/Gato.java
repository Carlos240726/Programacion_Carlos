package Tema6.Animal;

public class Gato extends Animal{
    public String nombre;
    public int edad;

    @Override
    public void comer() {
        System.out.println("ñam ñam... mrrp... chap chap...");
    }

    @Override
    public void dormir() {
        System.out.println("rrrrrr... fff... fff... hmmm... mmm...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau! Mew! Mau!");
    }

    public Gato(){
        this.nombre="Pelusa";
        this.edad=2;
    }
    public Gato(String nombre, int edad){
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
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void aranyar(){
        System.out.println(nombre + " esta arañando el sofa");
    }
}
