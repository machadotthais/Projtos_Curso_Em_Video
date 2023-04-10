package aula11_ProjetoPessoas2;

public class aula11 {

	public static void main(String[] args) {
		//Não pode implementar pois Pessoa é uma classe abstrata 
		//Pessoa p1 = new Pessoa();
		
//		Visitante v1 = new Visitante();
//		v1.setNome("Juvenal");
//		v1.setIdade(22);
//		v1.setSexo("M");
//		System.out.println(v1.toString());
//		
//		Aluno a1 = new Aluno();
//		a1.setNome("Adriano");
//		a1.setMatricula(11111);
//		a1.setIdade(20);
//		a1.setSexo("M");
//		a1.setCurso("Java");
//		a1.pagarMensalidade();
//		
//		Bolsista b1 = new Bolsista();
//		b1.setMatricula(11112);
//		b1.setBolsa(12.5);
//		b1.setSexo("F");
//		b1.setNome("Larissa");
//		b1.pagarMensalidade();
//		
//		Tecnico t1 = new Tecnico();
//		t1.setNome("Fernanda");
//		t1.setRegistroProfissinal(252500);
//		t1.setSexo("F");
//		t1.setIdade(21);
//		System.out.println(t1.toString());
//		t1.praticar();
		
		Professor p1 = new Professor();
		p1.setNome("João");
		p1.setIdade(65);
		p1.setEspecialidade("Ciências exatas");
		p1.setSexo("M");
		p1.setSalario(3500.00);
		p1.receberAumento(500.00);
		
		
		
	}

}
