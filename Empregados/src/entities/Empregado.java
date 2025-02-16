package entities;

public class Empregado {
	private String nome;
	private Integer horas;
	private Double valorPorHora;

	public Empregado() {

	}

	public Empregado(String nome, Integer horas, Double valorPorHora) {

		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}
	public double pagamento() {
		return horas * valorPorHora;
	}

}
