package Tema4.Reloj;

public class Reloj {

    int hora;
    int minutos;
    int segundos;
    boolean formato24=true;

    public void getHora( int hora, boolean formato24) {
        if (hora >= 0 && hora <= 23){
            this.hora=hora;
        } else if (hora>=24 && formato24) {
            while (hora>=24){
                hora=hora-24;
            }
            this.hora=hora;
        } else if (!formato24) {
            if (hora>=1 && hora<=12){
                this.hora=hora;
            }else if (hora>12){
                while (hora>12){
                    hora=hora-12;
                }
                this.hora=hora;
            }
        }else {
            this.hora=12;
        }
    }

    public void getMinutos( int minutos) {
        if (minutos>=0 && minutos <=59){
            this.minutos=minutos;
        }else {
            this.minutos=22;
        }
    }

    public void getSegundos(int segundos) {
        if (segundos>=0 && segundos <=59){
            this.segundos=segundos;
        }else {
            this.segundos=56;
        }
    }

    public void getFormato24 (boolean formato24) {
        this.formato24=formato24;
    }


    public void Reloj (){
        this.hora=14;
        this.minutos=26;
        this.segundos=38;
        this.formato24=true;
    }
    public void Reloj (int hora, int minutos, int segundos, boolean formato24){
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
        this.formato24=formato24;
    }

    public void showMenu (){
        System.out.println(formato24 + " formato");
        System.out.println(hora + " hora");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }

    public String toString () {
        System.out.println(formato24 + " formato");
        System.out.println(hora + " hora");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
        return "";
    }
}
