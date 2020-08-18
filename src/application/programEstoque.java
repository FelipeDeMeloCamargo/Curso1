package application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Product;

public class programEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declarando as variaveis do tipo Product que é da classe Product
		System.out.println("Enter product date: ");
		System.out.print("Name: ");
		String name = sc.next(); //Aqui a variavel product vai gravar o campo name o que vai ser digitado.
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price); //Declarar o construtor depois da entrada dos dados evita que os valores salvem zerados
		
		
		System.out.println("Product data: " + product);
		System.out.println("");
		System.out.println("Enter the number of products to  be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to  be added in stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
