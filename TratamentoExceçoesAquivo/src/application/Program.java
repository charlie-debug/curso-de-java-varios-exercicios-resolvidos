package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	File aquivo = new File("c:\\temp\\in.csv");
	Scanner sc = null;
	try {
		sc = new Scanner(aquivo);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não encontrado!");
		e.printStackTrace();
	}finally {
		if(sc != null) {
		sc.close();
		}
		System.out.println("Bloco finally foi executado!");
	}

	}

}
