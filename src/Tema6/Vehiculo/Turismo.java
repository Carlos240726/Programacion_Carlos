package Tema6.Vehiculo;

public class Turismo extends Vehiculo{
    public int plazas;
    public String tipo;
/*Constructores*/

    public Turismo(){
        super();
        this.plazas=5;
        tipo="particular";
    }
    public Turismo(String marca, String color, int ruedas, int plazas, String tipo){
        super(marca, color, ruedas);
        this.plazas=plazas;
        this.tipo=tipo;
    }

/*Propios*/
    public int getPlazas() {
        return plazas;
    }
    public String getTipo() {
        return tipo;
    }


    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*Heredados*/
    @Override
    public int getRuedas() {
        return super.getRuedas();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public String getMarca() {
        return super.getMarca();
    }


    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }
    @Override
    public void setRuedas(int ruedas) {
        super.setRuedas(ruedas);
    }
}
