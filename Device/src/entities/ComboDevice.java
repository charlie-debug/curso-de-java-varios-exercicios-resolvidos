package entities;

public class ComboDevice extends Device implements Printer,Scanner   {

	public ComboDevice(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String scan() {
		
		return "escaneado combo device!";
	}

	@Override
	public void print(String doc) {
		System.out.println("combo device impresso!");
		
	}

	@Override
	public void docProcessado(String doc) {
		System.out.println("documento processado!");
		
	}

}
