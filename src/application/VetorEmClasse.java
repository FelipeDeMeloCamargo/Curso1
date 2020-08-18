package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Vetor;
public class VetorEmClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vetor[] vetor = new Vetor[n]; // vetor de N posicoes

		for (int i = 0; i < vetor.length; i++) { //N foi substituido por vetor.length pois isso é a mesma coisa. Ele retorna a quantidade de posicoes no vetor.
			sc.nextLine();// Ao declarar int n = sc.nextLine, ficou um espaço em branco, esse aqui serve para consumir um espaço em branco
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vetor[i] = new Vetor(name, price); // Posicao i apontar para esse novo produto, pois irá referenciar a posicao N 
		}
		
		double soma = 0.0;
		
		for (int i=0; i < vetor.length; i++) {
			soma += vetor[i].getPrice(); // serve para soma receber a referencia do vetor na posicao i pelo com o valor getPrice.
			//Também irá guardar as 3 posicoes e soma-las.
		}
		double media = soma / vetor.length; //media = soma dividido pela quantidade de posicoes no vetor no caso N
		
		System.out.printf("Media: %.2f%n", media );
		sc.close();

	}

}
