package operacoes_matematicas;

public class operacoes_matematicas {

	public static void main(String[] args) {
	// numeros inteiros
		int a =25;
		int b = -2 ;
		int c= 7;
		int raiz;
		int potencia;
		int abs;
		 raiz = (int) Math.sqrt(a);
		System.out.println("A raiz quadrada é:"+raiz);
		potencia = (int) Math.pow(a, b);
		System.out.println("A potência é: "+potencia);
       abs = Math.abs(b);
       System.out.println("o valor abs é:"+abs);
	}

}
