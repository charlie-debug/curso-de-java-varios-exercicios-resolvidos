package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		metodo01();
		System.out.println("Fim do programa!");

	}
	public static void metodo01() {
		System.out.println("*****MÉTODO01 INICIO*****");
		metodo02();
		System.out.println("*****MÉTODO01 FIM*****");
	}
	public static void metodo02() {
		System.out.println("*****MÉTODO02 INICIO*****");
		Scanner sc = new Scanner(System.in);
		
			String[] vetor = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		

		sc.close();
		System.out.println("*****MÉTODO02 FIM*****");
	}
}
