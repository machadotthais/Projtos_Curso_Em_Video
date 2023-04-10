package aula11_ProjetoPessoas2;

public class Professor extends Pessoa {
	private String especialidade;
	private double salario;
	
	public void receberAumento(double aumento) {
		System.out.print("O salário do professor aumentou de R$" + this.salario);
		this.setSalario(this.getSalario() + aumento);
		System.out.println(" para R$ " + this.getSalario() );
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
