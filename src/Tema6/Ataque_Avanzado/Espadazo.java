package Tema6.Ataque_Avanzado;

public class Espadazo implements IAtaqueAvanzado{
    @Override
    public void lanzar() {
        System.out.println("Has utilizado espadazo");
    }

    @Override
    public void coste() {
        System.out.println("Ha costado 5 de energia");
    }

    @Override
    public void danoInfligido() {
        System.out.println("Has infligido 10 de daño fisico");
    }
}
