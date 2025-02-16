package model.services;

public class TaxaBrasileira implements ServicoTaxa {
public double taxa(double pagamentoBasico) {
	if(pagamentoBasico<=100.0) {
		return pagamentoBasico * 0.20;
	}else {
		return pagamentoBasico * 0.15;
	}
}
}
