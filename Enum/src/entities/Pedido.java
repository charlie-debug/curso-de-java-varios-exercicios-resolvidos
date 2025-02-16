package entities;

import java.util.Date;

import entities.enums.StatusPedido;

public class Pedido {
	private Integer id;
	private Date data;
	private StatusPedido pedido;

	public Pedido(Integer id, Date data, StatusPedido pedido) {
		this.id = id;
		this.data = data;
		this.pedido = pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getPedido() {
		return pedido;
	}

	public void setPedido(StatusPedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", pedido=" + pedido + "]";
	}

}
