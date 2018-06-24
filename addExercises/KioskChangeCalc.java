package addExercises;

public class KioskChangeCalc {

	public static void main(String[] args) {
		// define variables
		
		double cashGiven = 18;
		double saleCost = 17.18;
		
				
		// Call the returnChange function
		returnChange(cashGiven, saleCost);
		
		
	}
    private static void returnChange(double cashGiven, double saleCost) {
    	
    	
    	System.out.println("Kiosk Change Calculator");
    	System.out.println("Cash Given: " + cashGiven);
    	System.out.println("Total Sale: " + saleCost);
    	double totalChange = (cashGiven - saleCost)*100;
    	System.out.println("Total Change: " + totalChange);
    	
    	if (totalChange > 25) {
    		int numberofQtrs = (int)(totalChange)/25;
    		System.out.println("Number of Quarters: " + numberofQtrs);
    		double remainingChange = totalChange - (numberofQtrs * 25);
    		System.out.println("Remaining change: " + remainingChange);
    		totalChange = remainingChange;
    	}
    	    if (totalChange > 5) {
    	    	int numberofnickels = (int)(totalChange)/5;
        		System.out.println("Number of Nickels: " + numberofnickels);
        		double remainingChange = totalChange - (numberofnickels * 5);
        		System.out.println("Remaining change: " + remainingChange);
        		totalChange = remainingChange;
        		
        		if (totalChange>0) {
        			int numberofpennies = (int)(totalChange)/1;
            		System.out.println("Number of Pennies: " + numberofpennies);
            		//remainingChange = totalChange - (numberofpennies * 1);
            		//System.out.println("Remaining change: " + remainingChange);
            		//totalChange = remainingChange;
        			
        		}
    	    }
    		 
    	

	}

}
