package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("Digite as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();

		
		double areaY = y.area();

		System.out.printf("A area do triangulo X é: %.4f%n", areaX);
		System.out.printf("A area do triangulo Y é: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("A maior area é: X ");
		} else {
			System.out.println("A maior area é: Y ");
		}
		sc.close();

	}

}
