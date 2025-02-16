package services;

public class ServicoJurosBrasil implements ServicoJuros{
	private double juros;

	public ServicoJurosBrasil(double juros) {
		this.juros = juros;
	}
    
	@Override
	public double getJuros() {
		return juros;
	}
	


}
