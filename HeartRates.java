package assignment2;

import java.time.LocalDate;
import java.util.Date;

public class HeartRates {
        String firstName;
        String lastName;
        LocalDate dateOfBirth;
	   
        HeartRates(String firstName, String lastName, LocalDate dateOfBirth){
        	this.firstName = firstName;
        	this.lastName = lastName;
        	this.dateOfBirth = dateOfBirth;
        }
        
        
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
	
}
