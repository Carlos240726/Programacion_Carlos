package Tema6.Ataque;

public class AtaqueFisicoMagico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("Has utilizado ataque fisico magico");
    }

    @Override
    public void coste() {
        System.out.println("Ha costado 10");
    }

    @Override
    public void danoInfligido() {
        System.out.println("Has infligido 20 de daño");
    }
}
