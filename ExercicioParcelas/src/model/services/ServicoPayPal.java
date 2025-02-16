package model.services;

public class ServicoPayPal implements ServicoPagamentoOnline {

	@Override
	public double juros(double montante, int mes) {
		
		return montante * 0.01 * mes;
	}

	@Override
	public double taxa(double montante) {
		// TODO Auto-generated method stub
		return montante * 0.02;
	}

}
