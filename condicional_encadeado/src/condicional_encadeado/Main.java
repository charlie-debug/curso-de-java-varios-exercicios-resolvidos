package condicional_encadeado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;
		System.out.println("Digite um nº para saber que o dia da semana:");
		x = sc.nextInt();
		
		if(x==1) {
		 dia ="domingo";	
		}else if(x==2) {
			dia ="segunda-feira";
		}else if(x==3) {
			dia ="terça-feira";
		}else if(x==4) {
			dia ="quarta-feira";
		}else if(x==5) {
			dia ="quinta-feira";
		}else if(x==6) {
			dia ="sexta-feira";
		}else if(x==7) {
			dia ="sábado";
		}else  {
			dia ="Digite um número válido!";
		}
		
		System.out.println(dia);
		sc.close();
	}

}
