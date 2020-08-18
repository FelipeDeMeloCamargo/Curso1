package Entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double real, double dollar) {
		return real * dollar * (1.0 + IOF);
	}
	
	
}
