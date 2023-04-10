package aula10_ProjetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		//Programa principal 
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro Sampaio");
		p1.setIdade(32);
		p1.setSexo("Masculino");
		
		p2.setNome("Alice Maria");
		p2.setIdade(17);
		p2.setSexo("Feminino");
		p2.setCurso("Biologia");
		p2.setMatricula(856977);
		
		p3.setNome("Júlio Cesar");
		p3.setIdade(65);
		p3.setSexo("Masculino");
		p3.setEspecialidade("Ciências Biológicas");
		p3.setSalario(5600.00);
		
		p4.setNome("Bernadethe Hilgemberg");
		p4.setIdade(45);
		p4.setSexo("Feminino");
		p4.setSetor("Secretaria");
		p4.setTrabalhando(true);
		p4.mudarTrabalho();
		
		System.out.println(p1.dados());
		System.out.println(p2.dados());
		System.out.println(p3.dados());
		System.out.println(p4.dados());

	}

}
