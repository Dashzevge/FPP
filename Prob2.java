package assignment3;

public class Prob2 {

	private String instance1;
	
	private String instance2;
	
	private static String greeting = greetingMethod();
	
	
	//first Constructor
	Prob2 (String args) {
		setInstance1("Hello");
		setInstance2("World");
		System.out.println(instance1 + instance2 +" argument consructor");
		
	}
	
	//second Constructor
	Prob2 () {
		System.out.println("No argument consructor");
	}
	
	
	 // Instance method to set the brand of the instance1
    public void setInstance1(String instance1) {
    	System.out.println("1- Instance method");
        this.instance1 = instance1;
    }
    
    // Instance method to set the model of the instance2
    public void setInstance2(String instance2) {
    	System.out.println("2- Instance method");
        this.instance2 = instance2;
    }
    
	
	//static method 1th
	public static String greetingMethod() {
		System.out.println("1- Static method");
		
		return "Hello World";
		
	}
	
	//static method 2th
	public static String greetingMethod2() {
		
		System.out.println("2- Static method");
		
		return "Hello World Second";
		
	}
	
	//1th instance initialization block
	static 
	{
		
		System.out.println("1th static initialization block");
	}
	//1th instance initialization block
	{
		System.out.println("1th instance initialization block");	
	}
	//2th instance initialization block
	static 
	{
		System.out.println("2th static initialization block");
		
	}
	//2th instance initialization block
	{
		System.out.println("2th instance initialization block");
		
	}
	

	
}
