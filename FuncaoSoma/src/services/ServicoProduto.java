package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ServicoProduto {
	public double somaFiltrada(List<Produto> lista, Predicate<Produto> letraInicial) {
		double soma = 0.0;
		for (Produto p : lista) {
			if (letraInicial.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}

}
