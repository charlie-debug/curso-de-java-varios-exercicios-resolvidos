package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ServicoDoContrato;
import model.services.ServicoPayPal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre com os dados do contrato:");
		System.out.print("número:");
		int numero = sc.nextInt();
		System.out.print("data (dd/MM/yyyy):");
		LocalDate data = LocalDate.parse(sc.next(), dtf);
		System.out.print("valor total:");
		double valorTotal = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, valorTotal);
		System.out.println("Entre com o número de parcelas:");
		int n = sc.nextInt();
		ServicoDoContrato servico = new ServicoDoContrato(new ServicoPayPal());
		servico.contratoProcessado(contrato, n);
		System.out.println("PARCELAS:");
		for (Parcela parcela : contrato.getParcela()) {
			System.out.println(parcela);
		}
		sc.close();
	}

}
