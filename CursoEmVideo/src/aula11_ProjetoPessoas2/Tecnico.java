package aula11_ProjetoPessoas2;

public class Tecnico extends Aluno {
	private int registroProfissinal;
	
	//Método
	public void praticar() {
		System.out.println("Praticando o curso técnico...");
		
	}

	//Métodos GETTERS e SETTER
	public int getRegistroProfissinal() {
		return registroProfissinal;
	}

	public void setRegistroProfissinal(int registroProfissinal) {
		this.registroProfissinal = registroProfissinal;
	}
	
	

}
