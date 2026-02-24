package Tema6.Ficha;

public class Dvd extends Ficha{
    private String director;
    private String tipo;
    private int ano;

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    @Override
    public String toString() {
        return "Dvd{" +
                "titulo='" + titulo + '\'' +
                ", numero=" + numero +
                ", director='" + director + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
