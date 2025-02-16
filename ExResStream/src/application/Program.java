package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho completo do arquivo:");
		String caminho = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			List<Produto> lista = new ArrayList<Produto>();
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				Double preco = Double.parseDouble(campos[1]);
				lista.add(new Produto(nome, preco));
				linha = br.readLine();
			}

			double avg = lista.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / lista.size();
			System.out.println("avg: " + String.format("%.2f", avg));
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> nomes = lista.stream().filter(p -> p.getPreco() < avg).map(p -> p.getNome()).sorted(comp.reversed())
					.collect(Collectors.toList());
			nomes.forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("erro:" + e.getMessage());
		}

		sc.close();

	}

}
