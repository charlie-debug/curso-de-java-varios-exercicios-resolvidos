package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarros;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.TaxaBrazileira;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro:");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm):");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(),dtf);		
		System.out.print("Retorno (dd/MM/yyyy HH:mm):");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(),dtf);
		
		AluguelCarros aluguelCarros = new AluguelCarros(retirada, retorno, new Veiculo(modelo));
		System.out.print("Entre com o preço por hora: ");
		Double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double precoPorDia = sc.nextDouble();
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new TaxaBrazileira());
		servicoAluguel.processaFatura(aluguelCarros);
		System.out.println("FATURA:");
		System.out.println("pagamento básico: "+String.format("%.2f", aluguelCarros.getFatura().getPagamentoBasico()));
		System.out.println("imposto: "+String.format("%.2f", aluguelCarros.getFatura().getTaxa()));
		System.out.println("pagamento total: "+String.format("%.2f", aluguelCarros.getFatura().pagamentoTotal()));
		sc.close();

	}

}
