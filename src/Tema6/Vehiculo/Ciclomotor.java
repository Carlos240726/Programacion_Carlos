package Tema6.Vehiculo;

public class Ciclomotor extends Vehiculo{
    public int cilindrada;
/*Constructores*/

    public Ciclomotor(){
        super();
        this.cilindrada=125;
        System.out.println("Necesita un carnet");
    }
    public Ciclomotor(String marca, String color, int ruedas, int cilindrada){
        super(marca,color,ruedas);
        this.cilindrada=cilindrada;
        if (cilindrada>=125){
            System.out.println("Necesita un carnet");
        }
    }
/*Locales*/

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
