package application;

import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt(); // alocacao dos dados de entrada nos espaços da matriz
			}
		}
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) { // percorre matriz i linhas
			for (int j = 0; j < mat[i].length; j++) { // percorre matriz j e colunas
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) { //mat[i].length = n
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) { // mat.lenhth = m
						System.out.println("Down: " + mat[i + 1][j]);
					}

				}

			}

			sc.close();

		}
		
	}
}