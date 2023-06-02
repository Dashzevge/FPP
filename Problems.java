package assingment4;

public class Problems {
	
	static int countDigit = 0;
	static int sumOfNum = 0;
	static int [] arrayList = {13,45,26,78,100};
	
	public static void ReverseOrder(int num) {
		  //base case
		 if(num < 10) {
			 
			 System.out.println(num);
			 
			 return;
		 }
		 else {
			//Recursive case
			System.out.print(num % 10);
            
			 ReverseOrder(num/10);
		 }
	}
	
	public static void CountIntegerDigits(int num) {
		
		//base case
		if(num == 0) {
			System.out.print(countDigit);
			return ;
		}
		else {
	    //Recursive case
			countDigit++;
			
			CountIntegerDigits(num/10); 
			
		}
	}

	public static int SumOfAll(int[] array, int sizeN) {
		
		//base case
		if(sizeN <= 0) {
			return 0;
		}
		else {
	    //Recursive case
		  return (SumOfAll(array, sizeN - 1) + array[sizeN - 1]); 
		}
	}
	
	public static void ResultOfSum() {
		
		System.out.print(SumOfAll(arrayList, arrayList.length));
	}
	
	
	public static void main(String[] args) {
		
		   int num = 98930;
		   
		   System.out.print("Reversed number: ");
			 
	       Problems.ReverseOrder(num);
	       
		   System.out.print("Number of digits: ");
			 
	       Problems.CountIntegerDigits(num);
	       
	       System.out.print("\nSum of array: ");
	       
	       Problems.ResultOfSum();
			 
		
	}
	
}
