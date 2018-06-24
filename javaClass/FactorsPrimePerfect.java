package javaClass;

import java.util.Scanner;

public class FactorsPrimePerfect {

	public static void main(String[] args) {
		
		// define variables
		
		
		
		System.out.println("Please enter first boolean value in lowercase ");
				
		
		Scanner input= new Scanner(System.in);
		
		boolean xorval1 = input.nextBoolean();
		
		System.out.println("2nd boolean? ");
		//Scanner input2 = new Scanner(System.in);
		boolean xorval2 = input.nextBoolean();
		
				
		//call xor function - input 2 boolean values and returns true only if one is true and one is false
				
		xor(xorval1,xorval2);
		//xor(false,false);
				
				
		//call isFactor
		int numK = 3;
		int numN = 9;
		boolean factorreturn = isFactor(numK,numN);
		if (factorreturn ==true){
			System.out.println("Integer " + numK + " is a factor of " + numN);
		}
		else {
		    System.out.println("Integer " + numK + " is a factor of " + numN);
		}
				
		
		System.out.println("What is the number you want to check for prime? ");
		//Scanner input1= new Scanner(System.in);
		
		int primenum = input.nextInt();
				
		//call isPrime
		boolean returnvalue = isPrime(primenum);
			if (returnvalue==true) {
				System.out.println("This is a prime number");
			}
			else {
				System.out.println("This is NOT a prime number");
			}
			
		
		//call isPerfect
			int num=6;
			boolean perfectreturn = isPerfect(num);
			if (perfectreturn == true) {  //can also just be if (isPerfect(num)){ *when true it will execute
			   System.out.println(num + " is a Perfect number");
			}
			else {
			   System.out.println(num + " is NOT a Perfect number");
			}
		
		
		
		
	}
	//END OF MAIN
	
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
		
		public static boolean isFactor(int numK, int numN) {
			
			int ckfactor=numN%numK;
			if (ckfactor ==0) {
				return true;
			}
			else  {
				return false;
			}
		}
		
		//Check for perfect number
		
		public static boolean isPerfect(int n) {
			int i;
			int sum=0;
			for (i = 1; i < n; i++) {
				boolean result = isFactor(i,n);
		        if (result==true) {
		            sum=sum+i;
		        }
		    }
			return sum==n; 
				
			    
		
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
		
	


