package do_while;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius:");
			double c = sc.nextDouble();
			 double f = 9.0 * c / 5.0 + 32;
			System.out.printf("A temperatura em fahrenheit é: %.2f%n",f);
			System.out.println("Deseja repetir [s/n]?");
			 resp = sc.next().charAt(0);		
		}
		while(resp != 'n');
	     System.out.println("Atendimento finalizado!");
		sc.close();

	}

}
