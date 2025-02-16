package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
	List<String>lista = new ArrayList<>();
	lista.add("Matheus");
	lista.add("Kaio");
	lista.add("Mara");
	lista.add("Marta");
	lista.add("Jussara");
	lista.add("Anna");
	lista.add("Helio");
	lista.add("Matheus");
	lista.add(5, "Nayane");
	System.out.println("Tamanho da lista:"+lista.size());
	for (String x : lista) {
		System.out.println(x);
	}
	System.out.println("****************************");
	lista.remove("Anna");
	lista.remove(4);
	lista.removeIf(x->x.charAt(0)=='K');
	System.out.println("Tamanho da lista:"+lista.size());
	for (String x : lista) {
		System.out.println(x);
	}
	System.out.println("*************************");
	System.out.println("Index of Matheus: "+lista.indexOf("Matheus"));
	System.out.println("Last Index of Matheus: "+lista.lastIndexOf("Matheus"));
	System.out.println("******************************");
	List<String> resultado = lista.stream().filter(x->x.charAt(0)=='M').collect(Collectors.toList());
	for (String x : resultado) {
		System.out.println(x);
	}
	System.out.println("*******************************");
	String nome = lista.stream().filter(x->x.charAt(0)=='J').findFirst().orElse(null);
	System.out.println(nome);
	}
	
	
}
