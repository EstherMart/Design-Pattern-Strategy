package entities.concrets;

import entities.abstracts.Comportamento;

public class Personagem {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

   // Executa algum comportamento 
    public void executarAcao() {
        comportamento.executar_comportamento();
    }
}
