package Tema6.Red_Social;

public class PublicacionFoto implements IPublicacion,IAbrirPublicacion{
    @Override
    public void publicar() {
        System.out.println("Se ha publicado la foto");
    }

    @Override
    public void compartir() {
        System.out.println("Se ha compartido la foto");
    }
    public void abrir(){
        System.out.println("Se ha abierto la publicacion");
    }
}
