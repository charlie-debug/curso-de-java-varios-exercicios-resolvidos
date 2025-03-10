package application;

import entities.Circulo;
import entities.FiguraAbstrata;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {
		FiguraAbstrata f1 = new Circulo(Cor.PRETO, 2.0);
		FiguraAbstrata f2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);
		System.out.println("Cor do círculo:"+f1.getCor());
		System.out.println("Área do círculo:"+String.format("%.3f", f1.area()));
		System.out.println("Cor do retângulo:"+f2.getCor());
		System.out.println("Área do retângulo:"+String.format("%.3f", f2.area()));

	}

}
