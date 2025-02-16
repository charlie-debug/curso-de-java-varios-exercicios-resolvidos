package entities;

public class ScannerConcreto extends Device{

	public ScannerConcreto(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void docProcessado(String doc) {
		System.out.println("escaneando doc: "+doc);
		
	}
	public String scan() {
		return "escaneado domumento";
	}

}
