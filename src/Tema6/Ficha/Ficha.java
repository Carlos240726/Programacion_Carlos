package Tema6.Ficha;

public class Ficha {
    protected String titulo;
    protected int numero;

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    @Override
    public String toString() {
        return "Ficha{" +
                "titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
