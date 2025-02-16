package application;

import java.util.Locale;
import java.util.Scanner;

import enetities.Quarto;	

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Quarto[]vetor = new Quarto[10];
	System.out.println("Quantos quartos vão ser alugados?");
	int n = sc.nextInt();
	for (int i = 1; i <=n ; i++) {
		System.out.println("Quarto#"+i);
		System.out.print("Nome: ");
		sc.nextLine();
		String nome= sc.nextLine();
		System.out.print("Email:");
		String email= sc.nextLine();
		System.out.print("Numero do quarto:");
		int numeroQuarto= sc.nextInt();
		vetor[numeroQuarto] = new Quarto(nome, email);
	}
	System.out.println("Quartos ocupados:");
	for (int i = 0; i < vetor.length; i++) {
		if(vetor[i]!=null){
		System.out.println(i+" :"+vetor[i]);
		}
	}
	sc.close();

	}

}
