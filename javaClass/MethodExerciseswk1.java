package javaClass;

import java.util.Scanner;

public class MethodExerciseswk1 {

	public static void main(String[] args) {
		// define variables
		
		
		System.out.println("Please enter 3 Numbers: ");
		
		Scanner input= new Scanner(System.in);
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();
		int max = max3(v1,v2,v3);
		int min = min3(v1,v2,v3);
		int median = median3(v1,v2,v3);
		
		//call xor function - input 2 boolean values and returns true only if one is true and one is false
		
		xor(false,true);
		
		
		//call isFactor
		isFactor(3,9);
		
		System.out.println("The max number is: "+ max);
		System.out.println("The min number is: " + min);
		System.out.println("The median number is: " + median);
		
		//call isPrime
		boolean returnvalue = isPrime(7);
		if (returnvalue==true) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is NOT a prime number");
		}
	
	}
	//END OF MAIN
	
	
	// max3 function - user input 3 numbers and find the max
	
	public static int max3(int valOne, int valTwo, int valThree){
		int maxvalue=valTwo;
		if (valOne > valTwo) {
			maxvalue = valOne;
			
		}
		if (valThree > maxvalue) {
			maxvalue=valThree;
		}
		return maxvalue;
	}
	
	// min3 function - user input 3 numbers and find the min
	public static int min3(int valOne, int valTwo, int valThree) {
		int minvalue=valTwo;
		if (valOne < valTwo) {
			minvalue = valOne;
			
		}
		if (valThree < minvalue) {
			minvalue=valThree;
		}
		return minvalue;
	}
	// Find the median of the 3 #'s - it's not the max or the min value
	public static int median3(int valOne, int valTwo, int valThree) {
		
		int max=max3(valOne,valTwo,valThree);
		int min=min3(valOne,valTwo,valThree);
		int medianvalue= (valOne+valTwo+valThree) - (max+min);
		return medianvalue;
	}
	
	//Function of XOR - 2 boolean values given and if one is true and one is false, return true, 
	//otherwise return false.
	
	public static void xor(boolean value1, boolean value2) {
		if (value1==true) {
			if (value2==false) {
				System.out.println("Returns True");
				
			}
			else {
				System.out.println("both true so return false");
			}
		}
		else if (value2==true) {
			System.out.println("first one false, second one true - return true");
		}
		else {
			System.out.println("First one false, second one false - return false");
		}
	}
	
	
	//Method called isFactor which takes 2 integers (k and n) and returns true if and only if k is
	// a factor of n.
	
	public static void isFactor(int numK, int numN) {
		
		int ckfactor=numN%numK;
		if (ckfactor ==0) {
				System.out.println("Integer " + numK + " is a factor of " + numN);
		}
		else  {
			System.out.println("Integer " + numK + " is NOT factor of " + numN);
				
		}
	}	
	//Check if number is prime
		
	
	public static boolean isPrime(int n) {
			int i;
			for (i = 2; i <= n / 2; i++) {
		        if (n % i == 0) {
		            return false;
		        }
		    }
		    return true;
		
	}

}
	
	
		
		/*if (valOne == max) {
			if (valTwo ==min) {
				medianvalue=valThree;
			}
			else if(valThree==min) {
				medianvalue=valTwo;
			}
				
		else if (valTwo == max) {
			if (valOne ==min) {
				medianvalue=valThree;
			}
			else if(valThree==min) {
				medianvalue=valOne;
			}
		else if (valThree == max) {
			if (valOne ==min) {
				medianvalue=valTwo;
			}
			else if(valTwo==min) {
				medianvalue=valOne;
			}	
		}
		}
			}
			
		}
		
		*/
		//return medianvalue;

