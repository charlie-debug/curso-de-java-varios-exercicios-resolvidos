package estrutura_while;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nº inteiro diferente de 0:");
		int x = sc.nextInt();
		int soma = 0;
		while(x != 0) {
			
			System.out.println("Digite um nº inteiro diferente de 0:");
		    soma += x;
			x = sc.nextInt();
		}
		System.out.println("Soma "+soma);
		sc.close();
	}

}
