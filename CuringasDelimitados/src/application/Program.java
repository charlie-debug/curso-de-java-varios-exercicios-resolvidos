package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.Figura;
import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		List<Figura> minhaFiguras = new ArrayList<>();
		minhaFiguras.add(new Retangulo(3.0,2.0));
		minhaFiguras.add(new Circulo(2.0));
		
		List<Circulo> meusCirculos = new ArrayList<Circulo>();
		meusCirculos.add(new Circulo(2.0));
		meusCirculos.add(new Circulo(3.0));
		System.out.println("total area:"+totalArea(meusCirculos));

	}
	public static double totalArea(List<? extends Figura> lista) {
		double soma = 0.0;
		for (Figura figura : lista) {
			soma += figura.area();
		}
		return soma;
	}

}
