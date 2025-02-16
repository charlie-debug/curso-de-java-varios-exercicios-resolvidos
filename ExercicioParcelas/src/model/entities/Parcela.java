package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	private LocalDate vencimento;
	private Double valor;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Parcela() {

	}

	public Parcela(LocalDate vencimento, Double valor) {
		this.vencimento = vencimento;
		this.valor = valor;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return dtf.format(vencimento) + " - " + String.format("%.2f", valor);
	}
}
