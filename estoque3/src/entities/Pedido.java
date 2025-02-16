package entities;

import java.util.Date;

public class Pedido {
	public Date data;
	public Produto produto;

	public Pedido() {
		super();
	}

	public Pedido(Date data, Produto produto) {
		super();
		this.data = data;
		this.produto = produto;
	
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
