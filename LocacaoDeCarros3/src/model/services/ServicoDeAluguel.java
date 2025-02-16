package model.services;

import java.time.Duration;

import model.entities.AluguelCarros;
import model.entities.Fatura;

public class ServicoDeAluguel {
	private Double precoPorHora;
	private Double precoPorDia;
	private TaxaBrasileira taxaBrasileira;

	public ServicoDeAluguel() {
	}

	public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, TaxaBrasileira taxaBrasileira) {

		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaBrasileira = taxaBrasileira;
	}

	public void faturaProcessada(AluguelCarros aluguelCarros) {
		double minutos = Duration.between(aluguelCarros.getRetirada(), aluguelCarros.getRetorno()).toMinutes();
		double horas = minutos / 60.0;
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		} else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		}

		double taxa = taxaBrasileira.taxa(pagamentoBasico);
		aluguelCarros.setFatura(new Fatura(pagamentoBasico, taxa));
	}
}
