package entities;

public abstract class Device {
	private String numeroSerial;

	public Device() {
	}

	public Device(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public String getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public abstract void docProcessado(String doc);

}
