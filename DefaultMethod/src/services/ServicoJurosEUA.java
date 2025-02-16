package services;

public class ServicoJurosEUA implements ServicoJuros{
	private double juros;

	public ServicoJurosEUA(double juros) {
		this.juros = juros;
	}
    
	@Override
	public double getJuros() {
		return juros;
	}


}
