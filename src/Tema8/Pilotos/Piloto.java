package Tema8.Pilotos;

public class Piloto {
    private String codigo;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private int constructorid;
    private String enlace;

    public Piloto(String codigo,String nombre,String apellido,String fechaNacimiento,String nacionalidad, int constructorid,String enlace) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.enlace = enlace;
        this.constructorid = constructorid;
    }
    public Piloto() {
        this.codigo = "hjjk";
        this.nombre = "jhkhjkh";
        this.apellido = "hjkhkhjkhj";
        this.fechaNacimiento = "1976-10-09";
        this.nacionalidad = "hjklhjk";
        this.enlace = "https://uyiyuiyiyuhjkh.hkjhkhj";
        this.constructorid = 1;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEnlace() {
        return enlace;
    }
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public int getConstructorid() {
        return constructorid;
    }
    public void setConstructorid(int constructorid) {
        this.constructorid = constructorid;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", constructorid=" + constructorid +
                ", enlace='" + enlace + '\'' +
                '}';
    }
}
