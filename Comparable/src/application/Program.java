package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\temp\\in2.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[]campo = funcionarioCsv.split(",");				
				list.add(new Funcionario(campo[0],Double.parseDouble(campo[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario f : list) {
				System.out.println(f.getNome()+","+f.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
