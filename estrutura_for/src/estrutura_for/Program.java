package estrutura_for;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a qtd de repetições:");
		int n = sc.nextInt();
		int soma =0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite um nº inteiro:");
			int x = sc.nextInt();
			soma +=x;
		}
		System.out.println("A soma dos N números é:"+soma);
		sc.close();

	}

}
