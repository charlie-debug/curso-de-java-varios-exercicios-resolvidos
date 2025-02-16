package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
    String[] linhas = new String[] {"Bom dia,",
    		"boa tarde,","boa noite",
    		"pra quem está assistindo este vídeo! :)"};
    String caminho = "c:\\temp\\saída.txt";
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
    	for (String linha : linhas) {
			bw.write(linha);
			bw.newLine();
		}
		
	} catch (IOException e) {
		System.out.println("erro:"+e.getMessage());
	}
    
    
		
	}

}
