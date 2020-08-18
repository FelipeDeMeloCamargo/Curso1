package application;
import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //N será a quantidade de posicoes no vetor
		double[] vect = new double[n];    //declaracao de vetor com colchetes
		
		for (int i = 0; i < n ; i++) {   //variavel i será um contador para acessar as posicoes do vetor, 0,1,2,3...
			vect[i] = sc.nextDouble(); 
		}
		
		double soma = 0;
		for (int i = 0; i<n; i++) {
			soma += vect[i];
		}
		double media = soma / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
		sc.close();

	}

}
