package application;

import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
	
		List<Integer>myInts = Arrays.asList(2,5,10);
		 printList(myInts);
		 List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		 printList(myStrs);
		
	}
	
	public static void printList(List<?> lista) {
			for(Object obj : lista) {
			System.out.println(obj);
		}
	} 

}
