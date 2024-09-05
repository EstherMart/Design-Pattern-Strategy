package entities.concrets;

import entities.abstracts.Comportamento;

public class ComportamentoExplorar implements Comportamento {
    @Override
    public void executar_comportamento() {
        System.out.println("O personagem está explorando a área!");
    }
}
