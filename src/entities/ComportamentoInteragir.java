package entities;

public class ComportamentoInteragir implements Comportamento {
    @Override
    public void executar_comportamento() {
        System.out.println("O personagem está interagindo com um NPC!");
    }
}
