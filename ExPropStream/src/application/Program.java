package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho completo do arquivo:");
		String caminho = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			List<Empregado> lista = new ArrayList<>();
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				String email = campos[1];
				Double salario = Double.parseDouble(campos[2]);
				lista.add(new Empregado(nome, email, salario));
				linha = br.readLine();

			}
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			Comparator<String> comp = (x,y)->x.toUpperCase().compareTo(y.toUpperCase());
			List<String> emails = lista.stream().filter(p->p.getSalario()>salario).map(p->p.getEmail()).sorted(comp).collect(Collectors.toList());
			emails.forEach(System.out::println);
			
          double soma = lista.stream().filter(p->p.getNome().charAt(0)=='M').map(p->p.getSalario()).reduce(0.0, (x,y)->x+y);
          System.out.println("Soma de 'M': "+soma);

		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}

		sc.close();
	}

}
