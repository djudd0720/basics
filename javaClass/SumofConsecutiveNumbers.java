package javaClass;

public class SumofConsecutiveNumbers {

	public static void main(String[] args) {
		
	// Sum of consecutive numbers for 1-10, 20-30, 35-45
		
	int a = 35;
	int b = 45;
	int sum = sumOfNumbers(a,b);
	
	System.out.println("Sum of " + a + " thru " + b + " is equal to " + sum);

	}
	
    public static int sumOfNumbers(int a, int b) {
    	int i = 0;
    	int sum=0;
    	for (i=a; i<=b; i++) {
    		sum=sum+i;
    	}
    	
    	return sum;
    }
    
	
	
	
}
