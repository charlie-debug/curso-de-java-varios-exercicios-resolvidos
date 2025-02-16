package entities;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Produto> {

	@Override
	public void accept(Produto p) {
		p.setPreco(p.getPreco() * 1.1);

	}

}
