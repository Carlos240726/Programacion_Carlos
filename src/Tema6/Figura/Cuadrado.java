package Tema6.Figura;

public class Cuadrado extends Figura2D{
    protected double base;
    protected double altura;
    protected double area;
    protected double perimetro;

    public void area(double base, double altura, double area){
        area=base*altura;
        this.area=area;
    };
    public void perimetro(double base, double altura, double perimetro){
        perimetro=base*4;
        this.perimetro=perimetro;
    };


    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String toString() {
        return "Cuadrado{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
