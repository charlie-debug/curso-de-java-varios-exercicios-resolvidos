package application;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		String a  ="Maria";
		String b = "Maria";
		System.out.println(a.equals(b));
		
		System.out.println("======================================");
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com");
		String teste1 = new String("teste");
		String teste2 = new String("teste");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println("======================================");
		System.out.println(c1 == c2);
		System.out.println(teste1==teste2);
		

	}

}
