package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import services.ServicoJuros;
import services.ServicoJurosEUA;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	try {
		System.out.print("montante:");
		double montante = sc.nextDouble();
		System.out.print("meses:");
		int meses = sc.nextInt();
		ServicoJuros eua = new ServicoJurosEUA(1.0);
		double pagamento = eua.pagamento(montante, meses);
		System.out.println("pagamento depois de "+meses+" meses:");
		System.out.println(String.format("%.2f", pagamento));
		
	} catch (InvalidParameterException e) {
		System.out.println("erro: "+e.getMessage());
	}
	sc.close();

	}

}
