package Tema6.Ficha;

public class Revistas extends Ficha{
    private int numeroPublicacion;
    private int ano;

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public int getNumeroPublicacion() {return numeroPublicacion;}
    public void setNumeroPublicacion(int numeroPublicacion) {this.numeroPublicacion = numeroPublicacion;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    @Override
    public String toString() {
        return "Revistas{" +
                "titulo='" + titulo + '\'' +
                ", numero=" + numero +
                ", numeroPublicacion=" + numeroPublicacion +
                ", ano=" + ano +
                '}';
    }
}
