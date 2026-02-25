package Tema5.Registro;

public class Pajaro extends RegistroBase{
    private int hora;
    private double peso;
    private String especie;

    @Override
    public int getHora() {
        return hora;
    }

    @Override
    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Pajaro() {
        this.especie="Canario";
        this.peso=0.59;
        this.hora=10;
    }

    public Pajaro(String especie, int hora, double peso) {
        this.especie=especie;
        this.peso=peso;
        this.hora=hora;
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "hora=" + hora +
                ", peso=" + peso + "kg" +
                ", especie='" + especie + '\'' +
                '}';
    }
}
