package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import services.ServicoDoContrato;
import services.ServicoPaypal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados do contrato");
        System.out.print("número:");
        int numero = sc.nextInt();
        System.out.print("data (dd/MM/yyyy):");
        LocalDate data = LocalDate.parse(sc.next(),formato);
        System.out.print("valor do contrato:");
        double valor = sc.nextDouble();
        Contrato contrato = new Contrato(numero, data, valor);
        System.out.print("Entre com o número de parcelas:");
        int n = sc.nextInt();
        ServicoDoContrato servico = new ServicoDoContrato(new ServicoPaypal());
        servico.contratoProcessado(contrato, n);
        System.out.println("PARCELAS:");
         for (Parcelas parcelas : contrato.getParcelas()) {
			System.out.println(parcelas);
		}
        sc.close();
	}

}
