package application;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> lista = intList;
		Number x = lista.get(0);
		//lista.add(20); //erro de compilacao
	

	}

}
