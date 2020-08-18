package Entities;

public class Rectangle {

	public double width; //largura
	public double height; //altura

	public double area() {
		return width * height;

	}
	public double perimeter() {
		return (width + height) * 2;
		
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
