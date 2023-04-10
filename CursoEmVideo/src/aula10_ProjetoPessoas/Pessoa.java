package aula10_ProjetoPessoas;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
		
	}

	// Método toString
	public String dados() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
	// Métodos especiais GETTERS e SETTERS
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
