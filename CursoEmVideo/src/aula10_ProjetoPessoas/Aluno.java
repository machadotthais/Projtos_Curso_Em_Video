package aula10_ProjetoPessoas;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void cancelarMatricula() {
		System.out.println("Matrícula cancelada!");
	}
	// Métodos especiais GETTERS e SETTERS

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
