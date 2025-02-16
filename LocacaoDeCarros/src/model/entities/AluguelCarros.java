package model.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class AluguelCarros {
	private LocalDateTime retirada;
	private LocalDateTime retorno;
	private Veiculo veiculo;
	private Fatura fatura;

	public AluguelCarros() {

	}

	public AluguelCarros(LocalDateTime retirada, LocalDateTime retorno, Veiculo veiculo, Fatura fatura) {
		this.retirada = retirada;
		this.retorno = retorno;
		this.veiculo = veiculo;
		this.fatura = fatura;
	}
	public AluguelCarros(LocalDateTime retirada, LocalDateTime retorno, Veiculo veiculo) {
		this.retirada = retirada;
		this.retorno = retorno;
		this.veiculo = veiculo;
		
	}

	public LocalDateTime getRetirada() {
		return retirada;
	}

	public void setRetirada(LocalDateTime retirada) {
		this.retirada = retirada;
	}

	public LocalDateTime getRetorno() {
		return retorno;
	}

	public void setRetorno(LocalDateTime retorno) {
		this.retorno = retorno;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
