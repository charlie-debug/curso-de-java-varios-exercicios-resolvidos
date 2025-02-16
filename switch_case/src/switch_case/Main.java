package switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nº para saber que o dia da semana:");

		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sábado";
			break;
		
		default:
			dia="Nº inválido!";
			break;
		}		
		System.out.println("O dia da semana é: "+dia);
		sc.close();
	}

}
