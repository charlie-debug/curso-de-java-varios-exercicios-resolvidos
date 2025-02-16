package entities;

public class ContaPoupancaPlus extends ContaPoupanca {
	
	@Override
	public void saque(double montante) {
		saldo -= montante+9.0;
	}
}
