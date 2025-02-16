package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite x:");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("POSICAO=" + i + ", " + j);
					if (j > 0) {
						System.out.println("esquerda:" + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("acima:" + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("direita:" + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("abaixo:" + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
