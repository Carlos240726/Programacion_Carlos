package Tema6.Ataque_Avanzado;

public class EspadazoEncantado implements IAtaqueAvanzado{
    @Override
    public void lanzar() {
        System.out.println("Has utilizado espadazo encantado");
    }

    @Override
    public void coste() {
        System.out.println("Ha costado 5 de energia y 5 de mana");
    }

    @Override
    public void danoInfligido() {
        System.out.println("Has infligido 10 de daño fisico y 10 de daño magico");
    }
}
