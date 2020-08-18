package application;
import java.util.Scanner;
import Entities.PensaoClasse;

public class Pensao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PensaoClasse[] vetor = new PensaoClasse[10];//Criacao do vetor de 10 posicoes já definida anteiormente
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt(); // quantos quartos irao ser ocupados
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();//para consumir um espaco em branco na memoria
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("ROOM: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new PensaoClasse(name,email);	
			}
		System.out.println();
		System.out.println("Bussy rooms");
		for (int i=0; i<10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);		
				
			}
		}
		
		sc.close();
	}

}
