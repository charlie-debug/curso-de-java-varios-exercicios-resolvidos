package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("nome:");
		String nome = sc.nextLine();

		System.out.print("preco:");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);
		System.out.println(produto);
		produto.setNome("Martelo");
		System.out.println("nome atualizado= "+produto.getNome());
		produto.setPreco(1500.0);
		System.out.println("preco atualizado= "+produto.getPreco());
	  
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
