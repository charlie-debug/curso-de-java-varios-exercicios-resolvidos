package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> lista = new ArrayList<>();
		System.out.println("Entre com o numero de formas:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + "ª forma:");
			System.out.print("Retangulo ou Circulo(r/c):");
			char ch = sc.next().charAt(0);	
			System.out.println("Cor: PRETO/AZUL/VERMELHO:");
			Cor cor = Cor.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Largura:");
				sc.nextLine();
				double largura = sc.nextDouble();
				System.out.print("Altura:");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));

			} else {
				System.out.print("Raio:");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}

		}
		System.out.println();
		System.out.println("Minhas areas:");
		for (Forma forma : lista) {
			System.out.printf("Area= %.2f%n", forma.area());

		}
		sc.close();

	}

}
