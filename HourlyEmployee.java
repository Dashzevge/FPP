package assignment5;

public class HourlyEmployee extends Employee {
         double wage;
         double hours;
	
	HourlyEmployee(String firstname, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstname, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPayment() {
		return wage * hours;
	}
}
