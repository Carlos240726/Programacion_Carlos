package Tema6.Figura;

public class Triangulo {
    protected double base;
    protected double altura;
    protected double area;
    protected double perimetro;
    protected double lado2;
    protected double lado3;

    public void area(double base, double altura, double area){
        area=(base*altura)/2;
        this.area=area;
    };
    public void perimetro(double base, double lado2, double perimetro, double lado3){
        perimetro=base+lado2+lado3;
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

    public double getLado2() {return lado2;}
    public void setLado2(double lado2) {this.lado2 = lado2;}

    public double getLado3() {return lado3;}
    public void setLado3(double lado3) {this.lado3 = lado3;}

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}
