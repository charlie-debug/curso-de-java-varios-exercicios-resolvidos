package services;

import java.util.List;

public class CalculationServices {
	public static <T extends Comparable<? super T>> T max(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista não pode ser vazia!");
		}
		T max = lista.get(0);
		for (T item : lista) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
