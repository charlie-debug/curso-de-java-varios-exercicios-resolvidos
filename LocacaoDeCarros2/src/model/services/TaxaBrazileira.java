package model.services;

public class TaxaBrazileira {
public double taxa(double montante) {
	if(montante<=100.00) {
		return montante *0.20;
	}else {
		return montante * 0.15;
	}
}
}
