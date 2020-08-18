package Entities;

public class Product {
	private String name;  //usar o private ao inves de public, encapsula o método
	private double price;
	private int quantity; //Atributo da classe
	
	public Product(String name, double price, int quantity) {   //construtor
		this.name = name; //This serve para diferenciar o name atribudo do objeto, do parametro do metodo
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {   //Outro construtor somente com 2 argumentos
		this.name = name; //This serve para diferenciar o name atribudo do objeto, do parametro do metodo
		this.price = price;
	}
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts (int quantity) { // O quantity do atributo do metodo nao é o mesmo da classe
		this.quantity += quantity;
	}
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unity, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}
}
