package services;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcelas;

public class ServicoDoContrato {
	private ServicoDePagamentoOnline servicoDePagamentoOnline;

	public ServicoDoContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}

	public void contratoProcessado(Contrato contrato, int meses) {
     double quantiaBasica = contrato.getValorTotal()/meses;
     for(int i=1; i<=meses; i++) {
    	 LocalDate vencimento = contrato.getData().plusMonths(i);
    	 
    	 double juros = servicoDePagamentoOnline.juros(quantiaBasica,i);
    	 double taxa = servicoDePagamentoOnline.taxaDePagamento(quantiaBasica+juros);
         double quantia = quantiaBasica +juros+taxa;
         contrato.getParcelas().add(new Parcelas(vencimento,quantia));
         
     }
    		 
	}
}
