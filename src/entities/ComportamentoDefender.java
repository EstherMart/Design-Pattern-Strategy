package entities;

public class ComportamentoDefender implements Comportamento {
    @Override
    public void executar_comportamento() {
        System.out.println("O personagem está se defendendo do inimigo!");
    }
}
