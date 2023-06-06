package assignment5;
import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = new Professor("Jonhey",80000,LocalDate.of(1995, 5, 20),120);
	    department[1] = new Professor("White",60500,LocalDate.of(2000, 3, 15),120);
	    department[2] = new Professor("Ken",80000,LocalDate.of(2010, 1, 8),120);
	    department[3] = new Secretary("Jimmy",90000,LocalDate.of(2020, 10, 6),12);
	    department[4] = new Secretary("Bill",80000, LocalDate.of(2021, 12, 12), 10);
       
	    
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Do you wish to see the sum of all Professor and Secretary salary in the department ?  \n");
        String result = scanner.nextLine();

        if(result.equals("Y")) {
        	int sumSalary = 0;
        	for(DeptEmployee emp : department) {
        		sumSalary += emp.computeSalary();
        		
        	}
        		
        	    
            System.out.print("Sum of all Professor and Secretary salary is: " + sumSalary);
        }

        scanner.close();
	    
	}

}
