package util;

import java.util.function.Predicate;

import entities.Produto;

public class MyPredicate implements Predicate<Produto>{

	@Override
	public boolean test(Produto p) {
		
		return p.getPreco()>=100;
	}

}
