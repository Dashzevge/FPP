package assignment5;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	double baseSalary;
	
	BasePlusCommisionEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate, double baseSalary) {
		super(firstname, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.baseSalary = baseSalary;
	}
   
	@Override
	public double getPayment() {
		
		return (baseSalary + (grossSales * commisionRate));
		
	}	
}
