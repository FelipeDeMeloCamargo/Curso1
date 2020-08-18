package Entities;

public class ContaBancaria {
	private static double taxa = 5.00;
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nome) { //construtor da conta bancaria sem o saldo inicial. Valor do saldo vai zerado
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public ContaBancaria(int numeroConta, String nome, double deposito) { // construtor com deposito inicial.
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(deposito);
	}	

	public int getNumeroConta() { 
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double saldo) { //saldo recebe saldo inicial + saldo que será colocado
		this.saldo += saldo;
	}
	public void saque (double saldo) { // saldo recebe saldo atual - saldo que será colocado + a taxa
		this.saldo -= saldo + taxa;
	}
	public String toString() { // converter valores para String.
		return "Conta: "+ numeroConta + " Titular :  " + nome + " Saldo: " + String.format("%.2f", saldo);
	}

	
}
