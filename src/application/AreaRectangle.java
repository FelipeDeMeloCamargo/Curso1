package application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Rectangle;

public class AreaRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle(); //Declaracao de variavel usando a entidade Rectangle
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble(); //largura
		rectangle.height = sc.nextDouble(); //altura
		
		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
	
		sc.close();

	}

}
