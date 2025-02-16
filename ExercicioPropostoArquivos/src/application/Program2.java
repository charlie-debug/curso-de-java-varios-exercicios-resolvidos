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

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] linhas = new String[]  { "TV LED,1290.99,1", "CADEIRA GAMER,350.50,3", "IFHONE, 900.00,2",
		"SAMSUNG GALAXY 9,850.00,2" };
      String caminho = "c:\\temp\\entrada.csv";
      
		
		    try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
		    	for (String linha : linhas) {
					bw.write(linha);
					bw.newLine();
					}
		    	System.out.println("Entre com o caminho da pasta:");
		        String caminhoPasta = sc.nextLine();
		    	 boolean sucesso = new File(caminhoPasta+"\\out2").mkdir();
		         System.out.println("respota:"+sucesso);
		    	
				
			} catch (IOException e) {
				System.out.println("erro:"+e.getMessage());
			}
		    List<Produto> lista = new ArrayList<Produto>();
		    String caminho2= "c:\\temp\\entrada.csv";
		    try(BufferedReader br = new BufferedReader(new FileReader(caminho2))) {
		    	String itemcsv = br.readLine();
				while (itemcsv != null) {
					 System.out.println(itemcsv);
					String[] linha = itemcsv.split(",");
					String nome = linha[0];
					Double preco = Double.parseDouble(linha[1]);
					Integer quantidade = Integer.parseInt(linha[2]);
					lista.add(new Produto(nome, preco, quantidade));
					itemcsv = br.readLine();
				
				}
				
			} catch (IOException e) {
				System.out.println("erro:"+e.getMessage());
			}
		    String caminho3 = "c:\\temp\\out2\\saída.csv";
		    try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho3))) {
		    	for (Produto item : lista) {
					bw.write(item.getNome() + "," +  item.total());
					bw.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("erro:"+e.getMessage());
			}
		    
		    sc.close();

	}

}
