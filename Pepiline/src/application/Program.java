package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = lista.stream().map(p -> p * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		int soma = lista.stream().reduce(0, (x, y) -> x + y);
		System.out.println("soma: "+soma);
		
		List<Integer> listaNova = lista.stream().filter(p->p %2 ==0).map(p-> p * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(listaNova.toArray()));
	}

}
