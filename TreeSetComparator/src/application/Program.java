package application;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<Produto> set = new  TreeSet<>();
        set.add(new Produto("TV", 900.0));
        set.add(new Produto("Notebook",  1200.0));
        set.add(new Produto("Tablet", 400.0));
      
        for(Produto p : set) {
        	System.out.println(p);
        }

	}

}
