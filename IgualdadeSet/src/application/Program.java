package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<Produto> set = new  HashSet<>();
        set.add(new Produto("TV", 900.0));
        set.add(new Produto("Notebook",  1200.0));
        set.add(new Produto("Tablet", 400.0));
        
        Produto prod = new Produto("Notebook", 1200.0);
        
        System.out.println(set.contains(prod));
        
	}

}
