package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<?> myObjts1 = new ArrayList<>();
		List<Integer> myInts1 = new ArrayList<>();
		myObjts1 = myInts1; //erro de compilação
		//====================//====================//
		Object obj;
		Integer x = 10;
		obj = x;
		
	}

}
