package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarros;
import model.entities.Veiculo;
import model.services.ServicoDeAluguel;
import model.services.TaxaBrasileira;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro:");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm):");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(),dtf);
		System.out.print("Retorno (dd/MM/yyyy HH:mm):");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(),dtf);
		AluguelCarros aluguelCarros = new AluguelCarros(retirada, retorno, new Veiculo(modelo));
		System.out.print("Entre com o preço por hora:");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia:");
		double precoPorDia = sc.nextDouble();
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorHora,precoPorDia, new TaxaBrasileira());
		servicoDeAluguel.faturaProcessada(aluguelCarros);
		System.out.println("FATURA");
		System.out.println("pagamento básico:"+aluguelCarros.getFatura().getPagamentoBasico());
		System.out.println("imposto:"+aluguelCarros.getFatura().getTaxa());
		System.out.println("pagamento total:"+aluguelCarros.getFatura().pagamentoTotal());
		sc.close();

	}

}
