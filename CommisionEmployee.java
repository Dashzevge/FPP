package assignment5;

public class CommisionEmployee extends Employee{
	double grossSales;
	double commisionRate;
	
	CommisionEmployee(String firstname, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
		super(firstname, lastName, socialSecurityNumber);
		
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	@Override
	public double getPayment() {
		
		return (grossSales * commisionRate);
		
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

    	
}
