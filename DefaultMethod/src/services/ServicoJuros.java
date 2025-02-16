package services;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	double getJuros();

	default double pagamento(double montante, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("mês não pode ser menor ou igual a zero!");
		}
		return montante * Math.pow(1.0 + getJuros() / 100.0, meses);
	}
}
