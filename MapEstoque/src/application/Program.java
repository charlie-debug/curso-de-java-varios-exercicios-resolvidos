package application;

import java.util.HashMap;
import java.util.Map;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Map<Produto, Double> estoque = new HashMap<>();
		Produto p1  = new Produto("TV LED", 900.0);
		Produto p2 = new Produto("Notebook", 1200.0);
		Produto p3 = new Produto("Tablet", 400.0);
		
		estoque.put(p1, 10000.0);
		estoque.put(p2, 20000.0);
		estoque.put(p3, 15000.0);
		Produto p = new Produto("TV LED", 900.0);
		System.out.println("Contém a chave 'p': "+estoque.containsKey(p));
		

	}

}
