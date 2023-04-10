package aula07_Luta;

public class Lutador {
	//atributos
	private String nome, nacionalidade, categoria;
	private double altura, peso;
	private int vitorias, derrotas, empates, idade;
	
	//método construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.setNome(nome); 
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	//Métodos públicos
	public void apresentar() {
		System.out.println("----------- APRESENTAÇÃO DO LUTADOR -----------");
		System.out.println("Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente da(o) " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos e " + this.getAltura() + " metros de altura");
		System.out.println("Pesando " + this.getPeso() + "kg");
		System.out.println("Ganhou " + this.getVitorias() + " combate(s)");
		System.out.println("Perdeu " + this.getDerrotas() + " combate(s)");
		System.out.println("Empatou " + this.getEmpates() + " combate(s)");
		System.out.println("----------------- BOA LUTA!! -------------------");
		
	}
	
	public void status () {
		if (this.getCategoria() == "Inválido") {
			System.out.println(this.getNome() + " é peso " + this.getCategoria() + " não pode entrar em combate");
		} else {
			System.out.println("\n" + this.getNome() + " é peso " + this.getCategoria());
			System.out.println(this.getVitorias() + " vitórias");
			System.out.println(this.getDerrotas() + " derrotas");
			System.out.println(this.getEmpates() + " empates");
		}
		
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}

	
	//Métodos especiais GETTERS e SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
		
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
			
		} else if (this.getPeso() <= 70.4) {
			this.categoria = "Leve";
			
		} else if (this.getPeso() <= 83.9 ) {
			this.categoria = "Médio";
			
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
			
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
