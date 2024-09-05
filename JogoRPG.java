import entities.concrets.*;

import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {
        // Cria um novo objeto -> Personagem
        Personagem personagem = new Personagem();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("------------->ESCOLHA O QUE SEU PERSONAGEM DEVE FAZER<-------------");
            System.out.println("1. Atacar oponente");
            System.out.println("2. Defender ataque");
            System.out.println("3. Fugir da batalha");
            System.out.println("4. Explorar ambiente");
            System.out.println("5. Interagir com NPC");
            System.out.print("Opção: ");
            
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    personagem.setComportamento(new ComportamentoAtacar());
                    break;
                case 2:
                    personagem.setComportamento(new ComportamentoDefender());
                    break;
                case 3:
                    personagem.setComportamento(new ComportamentoFugir());
                    break;
                case 4:
                    personagem.setComportamento(new ComportamentoExplorar());
                    break;
                case 5:
                    personagem.setComportamento(new ComportamentoInteragir());
                    break;
                default:
                    System.out.println("Por favor, insira uma opção válida.");
                    continue;
            }
            
            personagem.executarAcao();
        }
    }
}