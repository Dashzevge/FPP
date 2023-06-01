package assignment2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	     //Prob1.Customers();
	     //Prob2.CalculateHeartRate();
		 Prob3.GetShape();
	}
	
	class Prob1{
		
		public static void Customers() {
			
			List<Customer> clientList = new ArrayList<>();

			Customer clientOne = new Customer("Johney", "Tom", "gh13821980");
			Address clientAddressOne = new Address("N104", "Chicago", "Illinios", "52467");
			
			clientOne.setBillingAddress(clientAddressOne);
			clientOne.setShippingAddress(clientAddressOne);
			
			clientList.add(clientOne);
			
			Customer clientTwo = new Customer("Billy", "Ketlen", "kl13821980");
			Address clientAddressTwo = new Address("L95", "Washington", "North", "52111");
			
			clientTwo.setBillingAddress(clientAddressTwo);
			clientTwo.setShippingAddress(clientAddressTwo);
			
			clientList.add(clientTwo);
			
			Customer clientThree = new Customer("White", "Washington", "dg13821980");
			Address clientAddressThree = new Address("G15", "Durham", "NC", "52228");
			
			clientThree.setBillingAddress(clientAddressThree);
			clientThree.setShippingAddress(clientAddressThree);
			
			clientList.add(clientThree);
			
			for(Customer item: clientList) {
				
				if(item.getBillingAddress().getCity().equals("Chicago")) {
					
					System.out.println(item.getFirstName() + " " + item.getlastName() + " City is:" + item.getBillingAddress().getCity());
				}
				
			}		
			
		}
		
	}
	
	class Prob2{
		
		public static void CalculateHeartRate() {
			
			
			 Scanner scanner = new Scanner(System.in);
			 
			 System.out.println("Please enter first name:");
			 
	         String firstName = scanner.nextLine();
	         
	         System.out.println("Please enter last name:");
			 
	         String lastName = scanner.nextLine(); 
			
             AgeCalculator age = new AgeCalculator(); 
	         
	         HeartRates person = new HeartRates(firstName, lastName, age.getBirthday());
	         
	         
	         
	        int ageofPerson = LocalDate.now().getYear() - person.getDateOfBirth().getYear();
	 		int rhr = 70;
	 		int mhr = 220 - ageofPerson;
	 		int ahr = mhr - rhr;
	 		double lb = 0.5;
	 		double ub = 0.85;
	 		double lbthr = (ahr * lb) + rhr;
	 		double ubthr = (ahr * ub) + rhr;
	 		
	 		
	         
	         System.out.println("The target Heart rate range is between " + lbthr + " and " + ubthr + "");
	         System.out.println("First Name:" + person.getFirstName());
	         System.out.println("Last Name:" + person.getLastName());
	         System.out.println("Age:" + ageofPerson);
	         System.out.println("Date of Birth:" + person.getDateOfBirth());
	         System.out.println("Maximum Heart Rate:" + mhr);
	       
	         
		}
		
		
	}
	
	class Prob3{
		
		public static void GetShape() {
			
			 Scanner scanner = new Scanner(System.in);
			 
			 System.out.println("Enter C for Circle\n"
			 		+ "Enter R for Rectangle\n"
			 		+ "Enter T for Triangle");
			 
	         String shapeLetter = scanner.nextLine();
	         
	         
	         if(shapeLetter.equals("C")) {
	        	 
	        	 System.out.println("Enter the raduis of Circle:");
				 
		         double raduis = scanner.nextInt(); 
		         
		         Circle circle = new Circle(raduis);        	
		         
		         System.out.println("The raduis of Circle is :" + circle.computeArea());
	
	         }
	         else if(shapeLetter.equals("R")) {
	        	 
	        	 System.out.println("Enter the width of the Rectangle:");
				 
		         double width = scanner.nextInt(); 
		         
		         System.out.println("Enter the height of the Rectangle:");
				 
		         double height = scanner.nextInt(); 
		         
		         Rectangle rectangle = new Rectangle(width, height);        	
		         
		         System.out.println("The area of Rectangle is:" + rectangle.computeArea());
	        	 
	        	 
	         }
	         else if(shapeLetter.equals("T")) {
	        	 
	        	 System.out.println("Enter the base of the Triangle:");
				 
		         double base = scanner.nextInt(); 
		         
		         System.out.println("Enter the height of the Triangle:");
				 
		         double height = scanner.nextInt(); 
		         
		         Triangle triangle = new Triangle(base, height);        	
		         
		         System.out.println("The area of Triangle is:" + triangle.computeArea());
	        	 
	         }
	         
	      
				
		}
		
	}
}
