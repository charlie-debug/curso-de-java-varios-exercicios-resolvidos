package debug;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura:");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento:");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o metro quadrado:");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("A area é %.2f%n ",area);
		System.out.printf("O Preço é %.2f%n ",preco);
		sc.close();
		

	}

}
