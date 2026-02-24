package Tema6.Vehiculo;

public class Camiones extends Vehiculo{
    public int peso;
    public boolean peligro;
/*Constructores*/
    public Camiones(){
        super();
        this.peso=10;
        this.peligro=false;
    }
    public Camiones(String marca, String color, int ruedas, int peso, boolean peligro){
        super(marca,color,ruedas);
        this.peso=peso;
        this.peligro=peligro;
    }
/*Locales*/

    public int getPeso() {
        return peso;
    }
    public boolean isPeligro() {
        return peligro;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setPeligro(boolean peligro) {
        this.peligro = peligro;
    }
/*Heredados*/

    @Override
    public String getMarca() {
        return super.getMarca();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public int getRuedas() {
        return super.getRuedas();
    }


    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    @Override
    public void setRuedas(int ruedas) {
        super.setRuedas(ruedas);
    }
}
