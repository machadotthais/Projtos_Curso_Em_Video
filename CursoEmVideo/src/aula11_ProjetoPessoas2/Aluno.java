package aula11_ProjetoPessoas2;

//Herança para diferença
//Aluno é uma especialização de Pessoa
public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	//Método
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}

	
	//Métodos GETTERS e SETTERS
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
