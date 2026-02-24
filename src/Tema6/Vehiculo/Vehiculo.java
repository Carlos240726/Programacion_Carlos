package Tema6.Vehiculo;

public class Vehiculo {
    protected String marca;
    protected String color;
    protected int ruedas;

    public Vehiculo(){
        this.marca = "Citroen";
        this.color="Blanco";
        this.ruedas=4;
    }
    public Vehiculo(String marca, String color, int ruedas){
        this.marca=marca;
        this.color=color;
        this.ruedas=ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        if (ruedas>=0) {
            this.ruedas = ruedas;
        }else {
            this.ruedas=4;
        }
    }
}
