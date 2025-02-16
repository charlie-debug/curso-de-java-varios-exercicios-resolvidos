package services;

public interface ServicoDePagamentoOnline {
	double taxaDePagamento(double montante);

	double juros(double montante, int mes);
}
