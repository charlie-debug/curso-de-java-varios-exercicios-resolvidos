package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo:");
		String caminhoArquivo = sc.nextLine();
		File arquivo = new File(caminhoArquivo);
		System.out.println("getName:"+arquivo.getName());
		System.out.println("getParent:"+arquivo.getParent());
		System.out.println("getPath:"+arquivo.getPath());
		sc.close();

	}

}
