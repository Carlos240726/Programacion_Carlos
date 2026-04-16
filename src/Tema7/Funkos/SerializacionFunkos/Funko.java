package Tema7.Funkos.SerializacionFunkos;

import java.io.Serializable;

public class Funko implements Serializable {
    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private String fecha;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public Funko(String codigo, String nombre, String modelo, double precio, String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Funko{" +
                "codigo=" + codigo  +
                ", nombre=" + nombre + '\'' +
                ", modelo=" + modelo + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha + '\'' +
                '}';
    }
}
