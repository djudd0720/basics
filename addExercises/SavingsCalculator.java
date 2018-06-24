package addExercises;

public class SavingsCalculator {

	public static void main(String[] args) {
	// define variables
	
	
			double presentValue = 20000;
			double interestRate = 4.5;
			double timeinMonths = 15;
			
			
			// Call the futureValue function
	        futureValue(presentValue, interestRate, timeinMonths);
		}
	    private static void futureValue(double presentValue, double interestRate, double timeinMonths) {
	    	System.out.println("Future Value");
	    	System.out.println("Present Value: " + presentValue);
	    	System.out.println("Interest Rate: " + interestRate);
	    	System.out.println("Number of Months: " + timeinMonths);
	    	
	    		    	
	    	//Determine future value
	    	double futureValue = presentValue*(1 + (interestRate * timeinMonths));
	    	System.out.println("Future Value: " + futureValue);
	    	
	    	
	    }
}
