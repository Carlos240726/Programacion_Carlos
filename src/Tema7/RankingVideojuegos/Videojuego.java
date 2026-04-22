package Tema7.RankingVideojuegos;

import java.io.Serializable;

public class Videojuego implements Serializable {
    String titulo;
    String plataforma;
    int nota;
    //public abstract getTipo;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }


}
