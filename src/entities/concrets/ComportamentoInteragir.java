package entities.concrets;

import entities.abstracts.Comportamento;

public class ComportamentoInteragir implements Comportamento {
    @Override
    public void executar_comportamento() {
        System.out.println("O personagem está interagindo com um NPC!");
    }
}
