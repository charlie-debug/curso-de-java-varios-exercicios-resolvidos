package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	private Date data;
	private StatusPedido statusPedido;
	private Cliente cliente;
	private List<ItemPedido> itensPedido = new ArrayList<>();

	public Pedido() {

	}

	public Pedido(Date data, StatusPedido statusPedido, Cliente cliente) {
		this.data = data;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void addItem(ItemPedido item) {
		itensPedido.add(item);
	}

	public void removeItem(ItemPedido item) {
		itensPedido.remove(item);
	}
	public double total() {
		double soma = 0.0;
		for (ItemPedido item : itensPedido) {
			soma += item.subtotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SOMATÓRIO DO PEDIDO: \n");
		sb.append("Data do pedido:");
		sb.append(sdf.format(new Date())+"\n");
		sb.append("Status do pedido:");
		sb.append(statusPedido+"\n");
		sb.append("Cliente:"+cliente.getNome() +",("+sdf2.format(cliente.getDataNascimento())+"), "+"E-mail:"+cliente.getEmail()+"\n");
		sb.append("ITENS DO PEDIDO:\n");
		for (ItemPedido item : itensPedido) {
		sb.append(item.getProduto().getNome()+", ");
		sb.append(item.getPreco()+",");
		sb.append("quantidade:");
		sb.append(item.getQuantidade()+",");
		sb.append("subtotal:");
		sb.append(item.subtotal()+"\n");
		
		
		}
		sb.append("preço total:");
		sb.append(total());
		return sb.toString();
	}
}
