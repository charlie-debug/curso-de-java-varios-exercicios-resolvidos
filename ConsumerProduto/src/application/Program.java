package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("TV", 900.0));
		lista.add(new Produto("Mouse", 50.0));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD case", 80.90));
		double precoNovo = 1.1;
		
		lista.forEach(p -> p.setPreco(p.getPreco() * precoNovo));

		lista.forEach(System.out::println);

	}

}
