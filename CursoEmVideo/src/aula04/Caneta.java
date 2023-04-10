package aula04;

public class Caneta {

	public String modelo;
	private float ponta;
	private boolean tampada;
	public String cor;

	public Caneta(String modelo, float ponta, boolean tampada, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.setTampada(tampada);
		this.cor = "azul";
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public void tampada() {
		this.tampada = true;
	}

	public void destampada() {
		this.tampada = false;
	}

	public boolean isTampada() {
		return this.tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("\nSobre a caneta: \n" + "Modelo: " + this.getModelo() + "\nPonta: " + this.getPonta());
		System.out.println("Cor: " + this.cor + "\nTampada: " + this.tampada);
	}

}
