package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1111, new Date(), StatusPedido.PROCESSANDO);
		System.out.println(pedido);
		System.out.println();
		StatusPedido sp1 = StatusPedido.PROCESSANDO;
		StatusPedido sp2 = StatusPedido.valueOf("PROCESSANDO");
		System.out.println(sp1);
		System.out.println(sp2);
	}
}
