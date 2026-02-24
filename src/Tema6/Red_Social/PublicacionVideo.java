package Tema6.Red_Social;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion{
    @Override
    public void compartir() {
        System.out.println("Se ha compartido el video");
    }

    @Override
    public void publicar() {
        System.out.println("Se ha publicado el video");
    }

    public void abrir(){
        System.out.println("Se ha abierto la publicacion");
    }
}
