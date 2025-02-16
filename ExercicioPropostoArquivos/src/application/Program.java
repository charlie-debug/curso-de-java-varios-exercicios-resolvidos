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

		/*String[] linhas = new String[] { "TV LED,1290.99,1", "CADEIRA GAMER," + " 350.50,3", "IFHONE, 900.00,2",
				"SAMSUNG GALAXY,9,850.00,2" };
		String caminho = "c:\\temp\\in.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("erro:" + e.getMessage());
		}*/
		List<Produto> lista = new ArrayList<Produto>();
		System.out.println("Entre com o caminho do arquivo:");
		String caminhoArquivo = sc.nextLine();
		File caminho = new File(caminhoArquivo);
		String caminhoPasta = caminho.getParent();
		System.out.println(caminhoPasta);
		boolean sucesso = new File(caminhoPasta + "\\out").mkdir();
		System.out.println("respota:" + sucesso);
		String pastaAlvo = "c:\\temp\\out\\in.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
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
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pastaAlvo))) {
				for (Produto item : lista) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println("criado:" + pastaAlvo);
			} catch (IOException e) {
				System.out.println("erro:" + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("erro:" + e.getMessage());
		}


		sc.close();
	}

}
