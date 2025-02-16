package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do cliente:");
		System.out.print("nome: ");
		String nome = sc.nextLine();
		System.out.print("email: ");
		String email = sc.nextLine();
		System.out.println("data de nascimento(dd/MM/yyyy):");
		Date dataNascimento = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status:");
		StatusPedido status = StatusPedido.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);
		System.out.print("Quantos itens para este pedido:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + "# pedido:");
			System.out.print("nome do produto:");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("preço:");
			double preco = sc.nextDouble();
			System.out.println("quantidade:");
			int quantidade = sc.nextInt();
			Produto produto = new Produto(nomeProduto, preco);
			ItemPedido item = new ItemPedido(quantidade, preco, produto);
			pedido.addItem(item);

		}
		System.out.println();
		System.out.println(pedido);

		sc.close();

	}

}
