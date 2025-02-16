package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Entre com o nome do departamento:");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), salarioBase,
				new Departamento(nomeDepartamento));
		System.out.println();
		System.out.println("Quantos contratos para este trabalhador:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
        System.out.println("Entre com os dados do "+i+ " contratos:");
        System.out.print("Entre com a data (dd/MM/yyyy):");
        Date data = sdf.parse(sc.next());
        System.out.print("Valor por hora:");
        double valorHora = sc.nextDouble();
        System.out.print("Duração:");
        int duracao = sc.nextInt();
        ContratoHora contrato = new ContratoHora(data, valorHora, duracao);
        trabalhador.addContrato(contrato);
        
		}
		System.out.println("Entre com o mês e ano para calcular o rendimento (MM/YYYY):");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0,2));
	    int ano = Integer.parseInt(mesEano.substring(3)); 
	    System.out.println("Nome: "+trabalhador.getNome());
	    System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
	    System.out.println("Rendimento: "+trabalhador.rendimento(ano,mes));
		sc.close();
	}

}
