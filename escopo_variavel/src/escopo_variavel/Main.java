package escopo_variavel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double preco = 400.0;
	double desconto;
	if(preco < 200.0) {
		desconto = preco * 0.20;
	}else {
		desconto=0;
		
	}
	System.out.println("O valor do desconto é: "+desconto);
	sc.close();
		
	}

}
