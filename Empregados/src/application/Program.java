package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> lista = new ArrayList<>();
		System.out.print("Entre com a quantidade de funcionarios:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + "Empregado:");
			System.out.print("Terceirizado[s/n]:");
			char ch = sc.next().charAt(0);
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("horas:");
			int horas = sc.nextInt();
			System.out.print("valor por hora:");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Despesa adicional:");
				double despesaAdicional = sc.nextDouble();
				
				lista.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, despesaAdicional));

			} else {
				lista.add( new Empregado(nome, horas, valorPorHora));
			}
		}
        System.out.println();
        System.out.println("PAGAMENTOS:");
        for(Empregado emp : lista) {
        	System.out.println(emp.getNome()+" - $"+String.format("%.2f", emp.pagamento()));
        }
		sc.close();

	}
}
