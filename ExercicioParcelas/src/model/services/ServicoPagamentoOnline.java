package model.services;

public interface ServicoPagamentoOnline {
	double juros(double montante, int mes);

	double taxa(double montante);

}
