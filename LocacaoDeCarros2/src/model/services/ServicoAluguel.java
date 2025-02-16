package model.services;

import java.time.Duration;

import model.entities.AluguelCarros;
import model.entities.Fatura;

public class ServicoAluguel {
private Double precoPorHora;
private Double precoPorDia;
private TaxaBrazileira taxaBrazileira;
public ServicoAluguel() {
	
}
public ServicoAluguel(Double precoPorHora, Double precoPorDia, TaxaBrazileira taxaBrazileira) {
	this.precoPorHora = precoPorHora;
	this.precoPorDia = precoPorDia;
	this.taxaBrazileira = taxaBrazileira;
}
public void processaFatura(AluguelCarros aluguelCarros) {
	double minutos =  Duration.between(aluguelCarros.getRetirada(), aluguelCarros.getRetorno()).toMinutes();
	double horas = minutos/60;
	double pagamentoBasico;
	if(horas<=12.0) {
		pagamentoBasico = precoPorHora * Math.ceil(horas);
	}else {
		pagamentoBasico = precoPorDia * Math.ceil(horas/24.0);
	}
	double taxa = taxaBrazileira.taxa(pagamentoBasico);
	aluguelCarros.setFatura(new Fatura(pagamentoBasico,taxa));	
}

}
