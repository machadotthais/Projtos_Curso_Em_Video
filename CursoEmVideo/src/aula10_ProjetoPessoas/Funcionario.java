package aula10_ProjetoPessoas;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
		
	}

	// Métodos especiais GETTERS e SETTERS
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
	

}
