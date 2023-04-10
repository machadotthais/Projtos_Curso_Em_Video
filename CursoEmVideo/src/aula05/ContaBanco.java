package aula05;

public class ContaBanco {
	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// métodos especiais (construtor)
	public ContaBanco(double saldo, boolean status) {
		this.setSaldo(0);
		this.setStatus(false);
	}

	// métodos personalizados
	
	public void estadoAtual() {
		System.out.println("------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
		System.out.println("------------------------------------");
		
	}
	public void abrirConta(String tipo) {
		setStatus(true);
		setTipo(tipo);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);

		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta nao pode ser fechada pois ainda tem saldo");
			this.setStatus(true);

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada pois ainda tem débito, regularize sua dívida!");
			this.setStatus(true);

		} else {
			System.out.println("Conta encerrada com sucesso!");
			this.setStatus(false);
		}

	}

	public void depositar(double valor) {
		if (this.isStatus() == true) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado na conta do " + this.getDono());

		} else {
			System.out.println("Conta fechada, impossível depositar");
		}

	}

	public void sacar(double valor) {
		if (this.isStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Saldo realizando na conta " + this.getDono());

			} else {
				System.out.println("Saldo insuficiente");
			}

		} else {
			System.out.println("Impossível sacar, conta não está aberta!");
		}
	}

	public void pagarMensalidade() {
		 double valorMensalidade = 0;
		if (this.getTipo() == "CC") {
			valorMensalidade = 12;
		} else if (this.getTipo() == "CP") {
			valorMensalidade = 20;
		}

		if (this.isStatus() == true) {
			if (this.getSaldo() > valorMensalidade) {
				this.setSaldo(getSaldo() - valorMensalidade);
			} else {
				System.out.println("Saldo insuficiente");
			}

		} else {
			System.out.println("Impossível pagar, conta não está aberta!");
		}

	}
	
	// métodos especiais (GETTER E SETTER)

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	

}
