package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[]linhas = new String[] {"TV LED,1290.99,1",
				"CADEIRA GAMER,350.50,3",
				"IFHONE X,900.00,2","SAM SUNG GALAXY 9,850.00,2"};
		String caminho = "c://temp/entrada.csv";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,false))) {
			for(String linha :linhas) {
				bw.write(linha);
				bw.newLine();
			}
			System.out.println("Entre com o caminho da pasta:");
			 caminho = sc.nextLine();
			boolean sucesso = new File(caminho+"\\saida").mkdir();
			System.out.println("resposta: "+sucesso);
			
		} catch (IOException e) {
			System.out.println("erro: "+e.getMessage());
		}
		List<Produto> lista = new ArrayList<Produto>();		
		caminho = "c://temp/entrada.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String itenscsv = br.readLine();
            while(itenscsv != null ) {
            	System.out.println(itenscsv);
            	String[] linha = itenscsv.split(",");
            	String nome = linha[0];
            	Double preco = Double.parseDouble(linha[1]);
            	Integer quantidade =Integer.parseInt(linha[2]);
            	lista.add(new Produto(nome, preco, quantidade));
            	itenscsv = br.readLine();
            }			
		} catch (IOException e) {
			System.out.println("erro: "+e.getMessage());
		}
		 File arquivoSaida = new File(caminho);
		 caminho = arquivoSaida.getParent()+"\\saida\\saida.csv";
		 System.out.println("getParent:"+arquivoSaida);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,false))){
			for(Produto itenscsv : lista) {
				bw.write(itenscsv.getNome()+","+itenscsv.total());
				bw.newLine();
			}
		} catch (IOException e) {
		System.out.println("erro:"+e.getMessage());
		}
		sc.close();

	}

}
