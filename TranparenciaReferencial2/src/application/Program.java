package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program {

	public static int comparaProduto(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("TV", 900.0));
		lista.add(new Produto("Notebook", 1200.0));
		lista.add(new Produto("Tablet", 400.0));

		lista.sort(Program::comparaProduto);
		lista.forEach(System.out::println);

	}

}
