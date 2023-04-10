package aula05;

public class Aula05 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco(0, false);
		p1.setNumConta(11111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco(0, false);
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		
		//p1.estadoAtual();
		//p2.estadoAtual();
		
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100);
		p1.fecharConta();
		p1.sacar(150);
		p1.fecharConta();
		p1.pagarMensalidade();
		p2.pagarMensalidade();
		p2.sacar(530);
		p2.pagarMensalidade();
		p1.depositar(50);
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		

	}

}
