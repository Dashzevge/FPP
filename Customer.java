package assignment2;

public class Customer {

	String firstName;
	String lastName;
	String socSecurityNum;
	Address shippingAddress; 
	Address billingAddress;
	
	
	Customer(String firstName, String lastName, String socSecurityNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	
	
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
}
