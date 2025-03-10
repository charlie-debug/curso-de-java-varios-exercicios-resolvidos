package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Copias {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	}

	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for (Number number : origem) {
			destino.add(number);
		}
	}
	public static void printList(List<?> lista) {
		for(Object obj : lista) {
			System.out.print(obj+" ");
		}
		System.out.println();
	}

}
