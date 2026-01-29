package Tema4.EjercicioPresentacion;

public class Main {
    public static void main (String[] args){
        Persona persona = new Persona();
        persona.nombre= "Ana";
        persona.edad=24;
        persona.setNombreEdad(persona.nombre, persona.edad);
        persona.showInfo();
        persona.setNombre(persona.nombre);
        persona.showInfo();
        persona.saludar();
        persona.presentarme();
        persona.saludarA("Manolo");

    }
}
