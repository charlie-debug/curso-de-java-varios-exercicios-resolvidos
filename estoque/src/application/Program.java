package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto:");
		System.out.print("nome:");
		produto.nome = sc.nextLine();

		System.out.print("preco:");
		produto.preco = sc.nextDouble();

		System.out.print("quantidade no estoque:");
		produto.quantidade = sc.nextInt();

		System.out.println(produto);
		System.out.println("Entre com uma qtd para ser adicionado ao estoque:");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println(produto);
		System.out.println();
		System.out.println("Entre com uma qtd para ser removido do estoque:");
        quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println(produto);
        
		sc.close();

	}

}
