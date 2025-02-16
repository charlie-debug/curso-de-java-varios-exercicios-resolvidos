package entities;

public class Circulo implements Figura {
	private double raio;

	public Circulo() {
		super();
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return Math.PI * Math.pow(raio, 2);
	}

}
