package assignment5;

public class SalariedEmployee extends Employee {
	double weeklySalary;
	
    SalariedEmployee(String firstname, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstname, lastName, socialSecurityNumber);
	}


	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}
     
	
}
