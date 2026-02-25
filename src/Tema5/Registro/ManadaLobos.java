package Tema5.Registro;

public class ManadaLobos extends RegistroBase{
    private int hora;
    private int cantidadLobos;
    private String observaciones;

    @Override
    public int getHora() {
        return hora;
    }

    @Override
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCantidadLobos() {
        return cantidadLobos;
    }

    public void setCantidadLobos(int cantidadLobos) {
        this.cantidadLobos = cantidadLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public ManadaLobos() {
        this.hora=19;
        this.cantidadLobos=10;
        this.observaciones="Volvian de perseguir un ciervo";
    }

    public ManadaLobos(String observaciones, int hora, int cantidadLobos) {
        this.hora=hora;
        this.cantidadLobos=cantidadLobos;
        this.observaciones=observaciones;
    }

    @Override
    public String toString() {
        return "ManadaLobos{" +
                "hora=" + hora +
                ", cantidadLobos=" + cantidadLobos +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
