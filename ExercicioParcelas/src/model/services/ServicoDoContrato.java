package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoDoContrato {
private ServicoPagamentoOnline servicoPagamentoOnline;

public ServicoDoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
	this.servicoPagamentoOnline = servicoPagamentoOnline;
}
public void contratoProcessado(Contrato contrato, int meses) {
	double montateBasico = contrato.getValorTotal()/meses;
	for(int i=1;i<=meses;i++) {
	LocalDate vencimento = contrato.getData().plusMonths(i);
	double juros = servicoPagamentoOnline.juros(montateBasico, i);
	double taxa = servicoPagamentoOnline.taxa(montateBasico+juros);
	double parcelaFinal = montateBasico+juros+taxa;
	contrato.getParcela().add(new Parcela(vencimento, parcelaFinal));
	}
}

}
