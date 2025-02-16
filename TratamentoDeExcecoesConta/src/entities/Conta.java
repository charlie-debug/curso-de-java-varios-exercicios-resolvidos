package entities;

import entities.exception.DomainException;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Conta() {
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double deposito(double montante) {
		return saldo += montante;
	}

	public double saque(double montante)  {
		if(montante>limiteSaque) {
			throw new DomainException("erro ao sacar: o valor excede o limite!");
		}if(montante>saldo) {
			throw new DomainException("erro ao sacar: saldo insuficiente!");
		}
		return saldo -= montante;
	}

	@Override
	public String toString() {
		return "novo saldo: " + saldo;
	}
}
