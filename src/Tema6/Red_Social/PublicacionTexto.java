package Tema6.Red_Social;

public class PublicacionTexto implements IPublicacion{
    @Override
    public void publicar() {
        System.out.println("Se ha publicado el comentario");
    }

    @Override
    public void compartir() {
        System.out.println("Se ha compartido el comentario");
    }
}
