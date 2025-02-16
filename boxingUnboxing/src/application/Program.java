package application;

public class Program {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("x=>Stack:"+x);
		Integer obj = x;
		System.out.println("obj=>Heap:"+obj);
		int y =  obj*2;
		System.out.println("y=>Stack:"+y);
	}

}
