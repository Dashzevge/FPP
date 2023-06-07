package assignment5;

public abstract class Employee {
      String firstName;
      String lastName;
      String socialSecurityNumber;
      
      Employee(String firstname, String lastName, String socialSecurityNumber) {
    	  this.firstName = firstname;
    	  this.lastName = lastName;
    	  this.socialSecurityNumber = socialSecurityNumber;
      }
      
     public abstract double getPayment();
	
	
}
