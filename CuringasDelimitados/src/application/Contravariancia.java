package application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

	public static void main(String[] args) {
		List<Object> myobjs = new ArrayList<>();
		myobjs.add("Maria");
		myobjs.add("Alex");
		myobjs.add("Bob");
		List<? super Number> myNums = myobjs;
		myNums.add(10);
		myNums.add(15.23);
		myNums.add(20.7);
		
		
		//Number x = myNums.get(0); //erro de compilacao
		

	}

}
