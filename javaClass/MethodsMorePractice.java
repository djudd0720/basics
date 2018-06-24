package javaClass;

public class MethodsMorePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumLimit(7,5);
		
		
	}
    //END OF MAIN
	
	
	


//sumLimit function - add a to b and print sum as long as the sum is the same # of digits as a or b
//else return only a

    public static int sumLimit(int a, int b) {
    	int sum=a+b;
    	int count = 0;
    	
    	
    	//for (int i=0; i<3;i++) {
          //check digits in a
    	System.out.println("A is: " + a);
    	int digitsInA=checkDigits(a);
    	System.out.println("Number of digits in a: " + digitsInA);
    	
    		//then check digits in sum
    	int digitsInSum=checkDigits(sum);
    	System.out.println("Number of digits in sum: " + digitsInSum);
    	
    	if(digitsInSum > digitsInA) {
    	    return a;
    	}
    	else {
    		return sum;
    	    		
    	}
        
    }
    
    public static int checkDigits(int num) {
    	int count = 0;
    	System.out.println("Num is: " + num);
    	while(num != 0)
		{
			// sum = sum/10
			num /= 10;
			++count;
		}
    	System.out.println("Count is " + count);
        return count;
    }
    
    }