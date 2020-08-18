// Programa sem orienta��o a objeto
package application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Triangle x = new Triangle();// para que ele exista � preciso instanciar o objeto. criar
		Triangle y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); //O calculo da �rea ficou mais curto pois todo o trabalho do calculo vem da classe Triangle
		double areaY = y.area();
		
		System.out.printf("�rea do Triangulo x: %.2f%n", areaX);
		System.out.printf("�rea do Triangulo y: %.2f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior �rea � a do X");
		}
		else {
			System.out.println("Maior �rea � a do Y");
		}
		
		
		sc.close();

	}

}
