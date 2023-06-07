package assignment5;

class DriverEmployee {

	public static void main(String[] args) {
		double totalSalary = 0;

		Employee[] employees = new Employee[] {new CommisionEmployee("Bill", "Toms", "SSN289042", 9000, 5), 
				                               new HourlyEmployee("Jehny", "Benny", "SSN123242", 100, 60), 
				                               new SalariedEmployee("Mikel", "Henry", "SSN193043", 1000), 
				                               new BasePlusCommisionEmployee("White", "Willson", "SSN990327", 5000, 100, 8000)};
		
		for(Employee emp : employees) 
			totalSalary += emp.getPayment();
		
		System.out.println("Total salaries of all the employees : " + totalSalary);
	}
}
