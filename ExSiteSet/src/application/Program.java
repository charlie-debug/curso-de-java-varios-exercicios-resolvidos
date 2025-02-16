package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntrada;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o caminho completo do arquivo:");
		String caminho = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			Set<LogEntrada> log = new HashSet<>();
			String linha = br.readLine();
			while(linha !=null) {
				String[] campos = linha.split(" ");
				String usuario = campos[0];
				Date data = Date.from(Instant.parse(campos[1]));
				log.add(new LogEntrada(usuario, data));
				linha = br.readLine();
			}
			System.out.println("Total de usuários: "+log.size());
			
			
		} catch (IOException e) {
			System.out.println("erro: "+e.getMessage());
		}
		sc.close();

	}

}
