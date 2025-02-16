package cumulativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double conta = 50.0;
		int minutos;
		System.out.println("Quantos minutos foram gastos?");
		minutos = sc.nextInt();
		if(minutos>100) {
			conta += (minutos-100)*2.0;
		}
		System.out.printf("Valor a pagar: %.2f%n",conta);
		sc.close();
		
	}

}
