package Tema6.Animal;

public class Vaca extends Animal{
    public String nombre;
    public int edad;

    @Override
    public void comer() {
        System.out.println("munch munch... crunch crunch...");
    }

    @Override
    public void dormir() {
        System.out.println("mmm mmm... hmm hmm...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Muuuuu!");
    }

    public Vaca(){
        this.nombre="Manchas";
        this.edad=5;
    }
    public Vaca(String nombre, int edad){
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
        return "Vaca{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void darLeche(){
        System.out.println(nombre + " esta siendo ordeñada");
    }
}
