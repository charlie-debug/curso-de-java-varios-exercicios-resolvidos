package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import services.CalculationServices;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto>lista = new ArrayList<>();
		String path = "c:\\temp\\produto.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] filds = line.split(",");
				lista.add(new Produto(filds[0],Double.parseDouble(filds[1])));
				line = br.readLine();
			}
			Produto x = CalculationServices.max(lista);
			System.out.println("Mais caro:");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("error:"+e.getMessage());
		}
		
	}

}
