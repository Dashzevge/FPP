package assignment5;

public class Circle extends Shape {
    static int raduis;
       
       
    Circle(String color, int raduis){
    	super(color);
    	this.raduis = raduis;
    }
    
    @Override
   	public double calculateArea() {
   		return Math.PI * raduis * raduis;
		
   	}
   	
    @Override
   	public double calculatePerimeter() {
   		return 2 * Math.PI * raduis;	
   	}
   	
}
