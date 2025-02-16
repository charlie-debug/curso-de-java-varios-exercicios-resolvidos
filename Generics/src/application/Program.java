package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<String> ps = new PrintService<>();
		System.out.println("Quantos valores:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String valor = sc.next();
			ps.addValor(valor);
		}
		ps.print();
		String x = ps.primeiro();
		System.out.println("primeiro: " + x);

		sc.close();

	}

}
