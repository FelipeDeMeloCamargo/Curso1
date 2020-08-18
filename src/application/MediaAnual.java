package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Student;

public class MediaAnual {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.next();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n ", student.finalGrade());
		
		if (student.finalGrade() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
		}
		
		System.out.printf("MISSING: %.2f%n ", student.missingPoints());
		
		
		
		
		
		sc.close();
		 

	}

}
