package aula09_ProjetoLivro;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	// Método toString depois renomeei para detalhes
	public String detalhes() {
		return "\nDetalhes do Livro: \n titulo= " + titulo + ",\n autor= " + autor + ",\n totPaginas= " + totPaginas
				+ ",\n pagAtual= " + pagAtual + ",\n aberto= " + aberto + ",\n leitor= " + leitor.getNome()
				+ ",\n idade= " + leitor.getIdade() + ",\n sexo= " + leitor.getSexo() + "";
	}

	// Método construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	// Métodos especiais GETTERS e SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	// Métodos abstratos da Interface Publicacao
	@Override
	public void abrir() {
		this.setAberto(true);
		System.out.println("O livro abriu!");

	}

	@Override
	public void fechar() {
		this.setAberto(false);
		System.out.println("O livro fechou!");

	}

	@Override
	public void folhear(int paginas) {
		if (paginas > this.totPaginas) {
			System.out.println(
					"Informe uma quantidade de páginas válida!\n" + "livro tem: " + this.getTotPaginas() + " páginas.");

		} else if (this.isAberto() == false) {
			System.out.println("Livro está fechado, impossivel folhear. Abra o livro primeiro");

		} else if (paginas <= this.totPaginas) {
			for (int i = 0; i <= paginas; i++) {
				System.out.println("Folheando páginas... " + i);
				this.pagAtual = paginas;
			}

		} else {
			System.out.println("Número de páginas ultrapassa o livro");
		}

	}

	@Override
	public void avancarPag() {
		this.setPagAtual(this.getPagAtual() + 1);
		System.out.println("Avançando página...");

	}

	@Override
	public void voltarPag() {
		this.setPagAtual(this.getPagAtual() - 1);
		System.out.println("Voltando página...");

	}

}
