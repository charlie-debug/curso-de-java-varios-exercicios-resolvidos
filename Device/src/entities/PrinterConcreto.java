package entities;

public class PrinterConcreto extends Device {
    
	public PrinterConcreto(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void docProcessado(String doc) {
		System.out.println("processando doc: "+doc);
	}
	
  public void print(String doc) {
	  System.out.println("imprimindo doc: "+doc);
  }
}
