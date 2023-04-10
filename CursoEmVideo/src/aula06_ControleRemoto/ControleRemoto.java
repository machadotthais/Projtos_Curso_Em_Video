package aula06_ControleRemoto;

public class ControleRemoto implements Controlador {
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//métodos especiais
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	//métodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.isLigado()) {
			System.out.println("------- MENU -------");
			System.out.println("Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i < this.getVolume(); i+=10) {
				System.out.print(" )");	
		}
			
		} else {
			System.out.println("TV desligada");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar volume!");
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir volume!");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
			
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
			
		}
	}
	
	
	
	

}
