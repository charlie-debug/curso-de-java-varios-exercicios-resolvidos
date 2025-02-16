package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		/*Conta conta = new Conta(1001, "Charlie", 0.0);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Alex", 0.0, 500.0);
		
		//upcasting
		Conta conta1 = contaEmpresarial;
		Conta conta2 = new ContaEmpresarial(1003, "Anna", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1004, "Maria", 0.0, 0.01 );
		
		//downcasting
		
		ContaEmpresarial conta4 =(ContaEmpresarial) conta2;
		conta4.emprestimo(200.0);
		//ContaEmpresarial conta5 = (ContaEmpresarial)conta3;
		if(conta3 instanceof ContaEmpresarial) {
			ContaEmpresarial conta5 = (ContaEmpresarial)conta3;
			conta5.emprestimo(500.0);
			System.out.println("Emprestimo!");
		}
		if(conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca)conta3;
			conta5.saldoAtualizado();
			System.out.println("Saldo Atualizado!");
		}
		
		Conta conta1 = new Conta(1001, "Charlie", 1000.0);
		conta1.saque(200.0);
		System.out.println("saldo:"+conta1.getSaldo());
        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println("saldo:"+conta2.getSaldo());
        Conta conta3 = new ContaEmpresarial(1003,"Alex", 1000.0, 500.0);
        conta3.saque(200.0);
        System.out.println("saldo:"+conta3.getSaldo());
        
	Conta x = new Conta(1000, "Charlie", 1000.0);
	Conta y = new ContaPoupanca(1001, "Maria", 1000.0, 0.01);
	x.saque(50.0);
	y.saque(50.0);
	System.out.println("saldo:"+x.getSaldo());
	System.out.println("saldo:"+y.getSaldo());
	
		Conta conta1 = new Conta(1001, "Charlie", 1000.0);
		Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		Conta conta3 = new ContaEmpresarial(1003, "Joana", 1000.0, 500.0);
		*/
		Locale.setDefault(Locale.US);
		List<Conta> lista = new ArrayList<>();
		lista.add(new ContaPoupanca(1001, "Charlie", 1000.0, 0.01));
		lista.add(new ContaEmpresarial(1003, "Maria", 1000.0, 500.0));
		lista.add(new ContaPoupanca(1005, "Alex", 1000.0, 0.01));
		lista.add(new ContaEmpresarial(1007, "Bob", 1000.0, 500.0));
		double soma = 0.0;
		for(Conta conta : lista) {
			soma+= conta.getSaldo();
			
		}
		System.out.println(soma);
		for(Conta conta : lista) {
			conta.deposito(10.0);
			
		}
		System.out.println("Saldos atualizados:");
		for(Conta conta : lista) {
			System.out.printf("saldos das contas %d : %.2f%n",conta.getNumero(),conta.getSaldo());
		}
	}
	

}
