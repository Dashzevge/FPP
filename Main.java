package assignment5;


public class Main {

	public static void main(String[] args) {
      	
		Shape [] shapes = new Shape[5];
		
        shapes[0] = new Rectangle("white", 1, 8);
      	shapes[1] = new Circle("black",9);
      	shapes[2] = new Square("blue",2);
      	shapes[3] = new Rectangle("pink",4,5);
      	shapes[4] = new Circle("yellow",6);  
      	
		printTotal(shapes);
		
	}
	
	public static void printTotal(Shape[] shapes)
	 { // Implement your code
		
	   double sumOfArea = 0;
	   double sumOfPerimeter = 0;
	   
	   for(Shape item : shapes) {
		 
		   sumOfArea += item.calculateArea();
		   sumOfPerimeter += item.calculatePerimeter();
		   
	   }
	   
	   System.out.println("Total of all area: " + sumOfArea);
	   System.out.println("Total of all perimeter: " + sumOfPerimeter);
		
	 } 
}
