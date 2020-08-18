package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.FuncionarioClasse;

public class SalarioFuncionarioLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<FuncionarioClasse> list = new ArrayList<>(); //declaração de uma lista

		System.out.print("How many employees will be registred?: ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #: " + (i + 1) + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) { //Repetidor: Enquanto id que foi colocado estiver na minha lista, faça
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt(); //insira novamente outro id diferente do que está na lista
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new FuncionarioClasse(id, name, salario)); //Adicionar tudo que está aqui na lista.

		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		FuncionarioClasse emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//Lambda
		//instacia uma variavel EMP recebendo a lista e a convertendo em Stream para que seja filtrado o primeiro ID do filtro, caso não , retorna nulo.
		if (emp == null) {
			System.out.println("This id does exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.aumento(percentage);//chamada do método de aumento da porcentagem de aumento
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (FuncionarioClasse obj : list) { //para a lista, declaramos a variavel Obj.
			System.out.println(obj);//Imprima obj toString
		}
		sc.close();
	}

	private static boolean hasId(List<FuncionarioClasse> list, int id) { // Esse predicado serve para validar que o
																			// usuario nao digite o mesmo id
		FuncionarioClasse emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
