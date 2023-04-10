package aula09_ProjetoLivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa [2];
		Livro[] l = new Livro [3];
		
		p [0] = new Pessoa ("Beatriz Vasconcelos", 28, "Feminino");
		p [1] = new Pessoa ("Alice Maria", 3, "Feminino");
		
		l [0] = new Livro ("O pequeno principe", "Antoine de Saint-Exupéry", 96, p[1]);
		l [1] = new Livro ("Os sete maridos de Evelyn Hugo", "Taylor Jenkins Reid", 411, p[0]);
		l [2] = new Livro ("O caminho do artista", "Julia Cameron", 325, p[0]);
		
		l[0].abrir();
		l[0].folhear(10);
		l[0].voltarPag();
		System.out.println(l[0].detalhes());
		
		System.out.println(l[1].detalhes());
		//l[0].fechar();
		//l[0].folhear(10);
		
		
		}

}
