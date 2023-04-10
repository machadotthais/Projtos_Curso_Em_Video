package aula11_ProjetoPessoas2;

//Especializacao de Aluno
public class Bolsista extends Aluno {
	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}

	//Método sobreposto
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
		
	}
	
	
	//Métodos GETTERS e SETTER
	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
