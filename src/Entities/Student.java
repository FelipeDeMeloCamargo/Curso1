package Entities;

public class Student {
	
	public String name;
	public double n1,n2,n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	public double missingPoints() {
		if (finalGrade() < 60) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
		
	}
}