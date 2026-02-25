package Tema5.Registro;

public class Serpiente extends RegistroBase{
    private int hora;
    private double longitud;
    private String especie;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public int getHora() {
        return super.getHora();
    }
    @Override
    public void setHora(int hora) {
        super.setHora(hora);
    }

    public Serpiente() {
        this.especie="Anaconda";
        this.longitud=2.05;
        this.hora=3;
    }

    public Serpiente(String especie, int hora, double longitud) {
        this.especie = especie;
        this.hora=hora;
        this.longitud=longitud;
    }

    @Override
    public String toString() {
        return "Serpiente{" +
                "hora=" + hora +
                ", longitud=" + longitud + "m " +
                ", especie='" + especie + '\'' +
                '}';
    }
}
