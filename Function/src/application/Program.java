package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Tv", 900.0));
		lista.add(new Produto("Mouse", 50.0));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("Hd case", 80.90));
				
		List<String> nomes = lista.stream().map(p->p.getNome().toUpperCase()).collect(Collectors.toList());
		nomes.forEach(System.out::println);
	

	}

}
