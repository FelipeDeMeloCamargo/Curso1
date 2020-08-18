package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.ContaBancaria;

public class banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contabancaria; // chamada dos contrutores, precisa ser chamado fora do IF, caso a resposta seja N, ele nao declará a variavel
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Is there an initial deposite (Y/N)? ");
		char resposta = sc.next().charAt(0); //Resposta do usuario em forma de caractere
			if(resposta == 'y' && resposta == 'Y') {
				double deposito;
				System.out.println("Enter inicial deposit value: ");
				deposito = sc.nextDouble();
				contabancaria = new ContaBancaria(numeroConta, nome, deposito); //sobrecarga, o mesmo construtur com diferentes exibicoes
			}
			else {
				contabancaria = new ContaBancaria(numeroConta, nome); //sobrecarga, o mesmo contrutor com diferentes exibicoes
			}
			
			System.out.println("Account data: " + contabancaria);
			
			System.out.print("Enter a deposit Value: ");
			double ValorDeposito = sc.nextDouble();
			contabancaria.deposito(ValorDeposito);
			
			System.out.println("Updated account data: " + contabancaria);
			
			System.out.print("Enter a Saque Value: ");
			double ValorSaque = sc.nextDouble();
			contabancaria.saque(ValorSaque);
			
			System.out.println("Updated account data: " + contabancaria);
			
			
		
		
		
		
		sc.close();

	}

}
