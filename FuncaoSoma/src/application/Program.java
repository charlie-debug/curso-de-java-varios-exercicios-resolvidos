package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto;
import services.ServicoProduto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Tv", 900.0));
		lista.add(new Produto("Mouse", 50.0));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("Hd case", 80.90));
				
		ServicoProduto sp = new ServicoProduto();
	   double soma = sp.somaFiltrada(lista,p->p.getPreco()<=100);
		
		System.out.println("soma: "+String.format("%.2f", soma));

	}

}
