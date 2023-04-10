package aula07_Luta;

import java.util.Random;

//REGRAS DA LUTA:

//1- só pode ser marcada entre lutadores da mesma categoria;
//2- desafiado e desafiante devem ser lutadores diferentes;
//3- só pode acontecer se estiver aprovada;
//4- só pode ter como resultado a vitória de um dos lutadores ou o empate.

public class Luta {
	// desafiado e desafiante são do tipo Lutador
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// métodos públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
			System.out.println("Luta irá acontecer!! Lutadores, preparem-se");
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("Luta não irá acontecer!");
		}

	}

	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("---------- RESULTADO DA LUTA ----------");
			switch (vencedor) {
			case 0: // Empate
				System.out.println("Empatou!\n");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;

			case 1: // Desafiado ganhou
				System.out.println("Vitória do " + this.getDesafiado().getNome()+ "\n");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;

			case 2: // Desafiante ganhou
				System.out.println("Vitória do " + this.getDesafiante().getNome() + "\n");
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			}

		} else {
			System.out.println("Luta não pode acontecer!");
		}

	}

	// métodos especiais
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
