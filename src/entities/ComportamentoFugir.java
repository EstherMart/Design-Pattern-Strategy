package entities;

public class ComportamentoFugir implements Comportamento {
    @Override
    public void executar_comportamento() {
        System.out.println("O personagem arregou :( Está fugindo do combate!");
    }
}
