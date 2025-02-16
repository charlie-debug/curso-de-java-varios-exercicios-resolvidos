package services;

public class ServicoPaypal implements ServicoDePagamentoOnline {

	@Override
	public double taxaDePagamento(double montante) {

		return montante * 0.02;
	}

	@Override
	public double juros(double montante, int mes) {

		return montante * 0.01 * mes;
	}

}
