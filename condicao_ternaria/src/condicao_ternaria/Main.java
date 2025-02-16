package condicao_ternaria;

public class Main {

	public static void main(String[] args) {
	double preco = 34.5;
	double desconto = (preco<20.0) ? preco * 0.10 : preco * 0.05;
	
	System.out.println("O valor do desconto é:"+desconto);	
	}

}
