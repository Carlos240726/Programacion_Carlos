package Tema5.Registro;

public class RegistroBase {
    private int hora;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "RegistroBase{" +
                "hora=" + hora +
                '}';
    }
}
