package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Entre com os dados da conta");
		System.out.print("número:");
		int numero = sc.nextInt();
		System.out.print("titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("saldo inicial:");
		double saldoInicial = sc.nextDouble();
		System.out.print("limite de saque:");
		double limiteSaque = sc.nextDouble();
		System.out.println();
		System.out.print("Entre com o montante para saque:");
		double montante = sc.nextDouble();
		Conta conta = new Conta(numero, titular, saldoInicial, limiteSaque);
		conta.saque(montante);
		System.out.println(conta);
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("erro inesperado!");
		}
		sc.close();

	}

}
