package entities;

public  class ContaPoupanca extends Conta {
	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void saldoAtualizado() {
		saldo += saldo * taxaJuros;
	}
	@Override
	public  void saque(double montante) {
		saldo -= montante;
	}
}
