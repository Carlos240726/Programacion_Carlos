package Tema6.Animal;

public class Conejo extends Animal{
    public String nombre;
    public int edad;

    @Override
    public void comer() {
        System.out.println("cric cric... crunch crunch...");
    }

    @Override
    public void dormir() {
        System.out.println("fff fff... hmm hmm...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("squeak... eek! brr... hmm");
    }

    public Conejo(){
        this.nombre="Mimi";
        this.edad=1;
    }
    public Conejo(String nombre, int edad){
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
        return "Conejo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void saltitos(){
        System.out.println(nombre + " esta dando saltitos");
    }
}
