package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String caminho = "c:\\temp\\entrada.txt";		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {			
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
		}

	}

}
