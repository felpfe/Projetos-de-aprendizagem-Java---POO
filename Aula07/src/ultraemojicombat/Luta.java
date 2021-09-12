package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador L1, Lutador L2) {
        if (L1.getCategoria() == L2.getCategoria()
                && L1 != L2) {
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;

        }


    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            //Escolha do vencedor
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        }else{
            System.out.println("A luta não pode ocorrer.");
        }


    }
}