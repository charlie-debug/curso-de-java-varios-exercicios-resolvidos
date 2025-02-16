package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas:");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[]idade = new int[n];
		double[]altura = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print("nome:");
			nome[i] = sc.next();
			System.out.print("idade:");
			idade[i] = sc.nextInt();
			System.out.print("altura:");
			altura[i] = sc.nextDouble();
		}
		double soma =0.0;
		for (int i = 0; i < n; i++) {
			soma+=altura[i];
		}
		double avg = soma/n;
		System.out.printf("Média das alturas: %.2f%n",avg);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(idade[i]<16) {
				count +=1;
			}
		}
		double porcentagem = count *100.0/n;
		System.out.printf("porcentagem: %.1f%%%n",porcentagem);
		for (int i = 0; i <n; i++) {
			if(idade[i]<16) {
				System.out.println(nome[i]);
			}
		}
	
		sc.close();

	}

}
