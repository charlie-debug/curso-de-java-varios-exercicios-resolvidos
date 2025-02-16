package entities;

import java.util.Comparator;

public class Produto implements Comparator<Produto> {
	private String nome;
	private Double preco;

	public Produto() {

	}

	public Produto(String nome, Double preco) {

		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int compare(Produto p1, Produto p2) {
		
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}

	

}
