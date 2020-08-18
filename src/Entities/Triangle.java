package Entities;

public class Triangle {
	
	/*Aqui estamos criando um tipo de variavel ao qual poderá ser usada em outros classes.
	 */
	public double a; //Public serve para que a variavel double A seja reconhecida em outra classe
	public double b;
	public double c;
	
	public double area() {  //funcao começa vazio pois nao precisa de receber outros valores fora a,b,c
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a)* (p - b) * (p - c));
		
	}
}
