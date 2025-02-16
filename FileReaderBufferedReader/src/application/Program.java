package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String caminho = "c:\\temp\\entrada.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
		} finally {
			try {
				if (fr != null)
					;
				fr.close();
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
