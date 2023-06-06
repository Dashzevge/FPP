package assignment5;

public class Rectangle extends Shape {
	static int width;
	static int height;

	Rectangle(String color, int width, int height){
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		
		return width * height;
	}
	
	@Override
	public double calculatePerimeter() {
		
		return 2 * width + 2 * height;
		
	}
	
	
	
}
