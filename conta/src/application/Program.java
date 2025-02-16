package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.print("Entre com o numero da conta:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o nome do titular da conta:");
		String titular = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial[s/n]?");
		char resposta = sc.next().charAt(0);
		if(resposta=='s') {
			System.out.print("Digite o valor do deposito inicial:");
			double depositoInicial = sc.nextDouble();
			 conta = new Conta(numero, titular, depositoInicial);
		}else {
			conta = new Conta(numero, titular);
		}
		System.out.println(conta);
		System.out.println();
		System.out.print("Digite um valor para ser depositado:");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.print(conta);
		System.out.println();
		System.out.print("Digite um valor para ser sacado:");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.print(conta);
		sc.close();
	}

}
