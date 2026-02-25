package Tema6.Ataque;

public class AtaqueMagico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("Has utilizado ataque magico");
    }

    @Override
    public void coste() {
        System.out.println("Ha costado 5");
    }

    @Override
    public void danoInfligido() {
        System.out.println("Has infligido 10 de daño");
    }
}
