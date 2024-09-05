package entities.concrets;
import entities.abstracts.Comportamento;

public class ComportamentoAtacar implements Comportamento {
    @Override
    public void executar_comportamento() {
        System.out.println("O personagem está golpeando o inimigo!");
    }
}
