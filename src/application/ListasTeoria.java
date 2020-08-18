package application;

import java.util.ArrayList;
import java.util.List;

public class ListasTeoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>(); // implementacao da lista e instanciação
		//declaracao do nome da lista; Tipo da lista (Não aceita tipos primitivos); ArrayList é a classe para implementar o List
	
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Felipe");//Adicionará um nome a posicao 2 da lista
		
		System.out.println(list.size()); //tamanho da lista
		
		list.remove("Ana");//Remove pela instancia de string comparando-as
		list.remove(1); //Remove também pelo numero da posicao da lista
		list.removeIf(x -> x.charAt(0) == 'M');//predicado, remove todos que tem a letra M. Se chama funcao lambda
		System.out.println(list.indexOf("Felipe"));//Imprime a possicao do nome na lista
		System.out.println(list.indexOf("Alex"));
		for(String x : list) { // para cada string x pertencente a minha lista 'list', faça
			System.out.println(x);
		}
	}

}
