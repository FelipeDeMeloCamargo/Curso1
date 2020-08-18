package application;

import java.util.Scanner;

public class MatrizTeoria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();//quantidade de posicoes da matriz
		int[][] mat = new int[n][n];// instanciar a matriz bi dimencional na memoria com n posicoes. 3 linhas e 3 colunas

		for (int i=0; i<n; i++) { // for serve para percorrer toda a matriz em linha
			for (int j=0; j<n; j++) { // serve para percorrer todas colunas
				mat[i][j] = sc.nextInt();
			}

		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		// verificar se há numero negativo e retornar a quantidade
		int count = 0;// contador
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}

		}
		System.out.println("Negative numbers " + count);
		sc.close();

	}

}
