package assignment5;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

	int numberOfPublications;
	
	 Professor(String name, double salary, LocalDate hireDate, int numberOfPublications){
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
		
	}

}