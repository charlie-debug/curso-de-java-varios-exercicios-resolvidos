package curso_programacao;

import java.util.Locale;

public class Main {
  
	public static void main(String[] args) {
		//int y = 32;
		//double x = 10.35784;
		//System.out.println("OLÁ MUNDO!");
		//System.out.println("BOM DIA!!");
		//System.out.println(y);
		//System.out.printf("%.2f%n",x);
		//System.out.printf("%.4f%n",x);
		//System.out.println("RESULTADO "+y+" METROS");
		//System.out.printf("RESULTADO = %.4f  METROS%n",x);
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha  R$ %.2f reais%n",nome,idade,renda);
        Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha  R$ %.2f reais%n",nome,idade,renda);

		
	}

}
