package demo;

public class FlooringInstallationEstimator {

	public static void main(String[] args) {
		// define variables
		int squareFeet = 2000;
		String floorType = "Hardwood";
		
		// Call the getQuote function
        getQuote(squareFeet, floorType);
	}
    private static void getQuote(int squareFeet, String floorType) {
    	System.out.println("Quote");
    	System.out.println("SQ FT: " + squareFeet);
    	System.out.println("Floor Type: " + floorType);
    	
    	//Define the variables
    	double baseRate = 3;
    	double carpetRate = .5;
    	double hardwoodRate = 1.5;
    	double totalRate = 0;
    	double totalCost = 0;
    	double hardwoodHardwareFee = 100;
    	
    	//Determine floor type and rate
    	if (floorType == "Carpet") {
    		totalRate = baseRate + carpetRate;
    		
    	}
    	else if (floorType == "Hardwood") {
    		totalRate = baseRate + hardwoodRate;
    		totalCost = totalCost + hardwoodHardwareFee;
    	}
    	else {
    		System.out.println("Error: Couldn't Read Floor Type");
    	}
    	//Calculate the total cost
    	System.out.println("Total rate: " + totalRate);
    	totalCost=totalCost + totalRate * squareFeet;
    	System.out.println("Total cost: " + totalCost);
    	
    	//Apply Discount
    	if (squareFeet >= 1500) {
    		double discount = totalCost * .1;
    		totalCost = totalCost - discount;
    		System.out.println("Total with Discount: $" + totalCost);
    	}
    }
}
