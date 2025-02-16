package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {
		return preco*quantidade;
	}
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
	return "Dados do produto: "
			+nome
			+", $ "
			+String.format("%.2f", preco)
			+", "
			+quantidade
			+" unidades, total: $ "
			+String.format("%.2f",valorTotalEstoque());
		
	}
}
