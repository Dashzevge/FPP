package assignments;

import java.util.Arrays;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prog1.FindXandY();
		Prog2.GetProductIdsFromArray();
        Prog3.RemoveDups();
		Prog4.FloatSum();
		Prog5.CombinedArray();
		Prog6.FindMini();
	}
	
	
	class Prog1{
		
		public static void FindXandY() {

	        int x = RandomNumbers.getRandomInt(1, 9);
	        double result1 = Math.pow(Math.PI, x);

	        int y = RandomNumbers.getRandomInt(3, 14);
	        double result2 = Math.pow(y, Math.PI);

	        System.out.println("Result x: " + result1);
	        System.out.println("Result y: " + result2);
			
		}			
	}	
	
    class Prog2{
		
		public static void GetProductIdsFromArray() {
			
			String records = "231A,Light Bulb,123,Wilco,1.75:"+
					"113D,Hairbrush,19,Aamco,3.75:"+
					"521W,Shampoo,24,Acme,6.95:"+
					"440Q,Dishwashing Detergent,20,Wilco,1.75:"+
					"009G,Toothbrush,77,Wilco,0.85:"+
					"336C,Comb,34,Wilco,0.99:"+
					"523E,Paper Pad Set,109,Congdon and Chrome,2.45:"+
					"888A,Fake Diamond Ring,111,AmericusDiamond,3.95:"+
					"176A,Romance Nove1 1,20,Barnes and Noble,3.50:"+
					"176B,Romance Nove1 2,20,Barnes and Noble,3.50:"+
					"176C,Romance Nove1 3,20,Barnes and Noble,3.50:"+
					"500D,Floss,44,Wilco,1.25:"+
					"135B,Ant Farm,5,Wilco,8.00:"+
					"211Q,Bicycle,9,Schwinn,75.95:"+
					"932V,Pen Set,50,Congdon and Chrome,9.95:"+
					"678Q,Pencil 50,123,Congdon and Chrome,9.95:"+
					"239A,Colored Pencils,25,Congdon and Chrome,4.75:"+
					"975B,Shower Curtain,25,Wilco,6.50:"+
					"870K,Dog Bowl,15,Wilco,4.75:"+
					"231S,Cat Bowl,15,Wilco,4.75:"+
					"562M,Kitty Litter,15,Wilco,3.25:"+
					"777X,Dog Bone,15,Wilco,4.15:"+
					"933W,Cat Toy,15,Wilco,2.35:"+
					"215A,Hair Ball,0,Little Jimmy,0.00:";
			
			
			String[] array = records.split(":");
			
		
			String[][] array2d = new String[array.length][];
			
			for(int i = 0;i<array.length;i++) {
					
				array2d[i] = array[i].split(",");
				
				System.out.println(array2d[i][0]);
			}
			
		}			
	}
	
    class Prog3{
    	
    	
        public static void RemoveDups() {
        	
        	String[] tmpArray = {"horse", "dog", "cat", "horse", "dog"};
        	int newSize = 0; 
        	for(int i = 0; i < tmpArray.length; i++) {
        		 if (tmpArray[i] != "") {
	        		for(int j = i + 1; j < tmpArray.length; j++) {
	            	if(tmpArray[i].equals(tmpArray[j])) {
	            		tmpArray[j] = "";	
	            
	            	}       			
	            	 
        		}
	        		newSize ++;
            }
     
        	}
        	
        	
        	 String[] newArray = new String[newSize];
		        
        	 int index = 0;
		        for (String item : tmpArray) {
		            if (item != "") {
		                newArray[index++] = item;
		            }
		        }		 
     		 
		    System.out.println(Arrays.toString(newArray));
    
        }
    	
    }
    
    class Prog4{
    	
        public static void FloatSum() {
        	float a = (float) 1.27;
        	float b = (float) 3.881;
        	float c = (float) 9.6;
        	
        	int Sum = (int) (a + b + c);
        	
        	System.out.println(Math.round(Sum));
        	
        }
    	
    }
    
    class Prog5{
    	
        public static void CombinedArray() {
        	               	
        	int[] a = {5,6,-4,3,1};
        	
        	int[] b = {3,8,9,11};
        	
        	int[] combinedArray = new int[ a.length + b.length];
        	
        	System.arraycopy(a, 0, combinedArray, 0, a.length); 
        	
        	System.arraycopy(b, 0, combinedArray, a.length, b.length); 

            System.out.println(Arrays.toString(combinedArray));

        }
        
    	
    }
    
    class Prog6{
    	
        public static void FindMini() {
        	               	
        	int[] a = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
             
        	int min = a[0];
        	           
        	for(int i = 0; i < a.length; i++) {
	        	    if(a[i] < min) {
	        	    	
	        	    	min = a[i];
	        	    	
	        	    } 

        	}
        	
            System.out.println("Min number in the array is: " + min);

        }
        
    	
    }

}

