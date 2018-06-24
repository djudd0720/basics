package addExercises;

public class TipRecommenderwithreturn {

	public static void main(String[] args) {
		// calculate recommended tip based on tab and service quality
		// define variables
		
				double tabAmt = 33.57;
				String serviceQuality = "Great";
				
				
				// Call the getTip function
				double tip = getTip(tabAmt, serviceQuality);
				
				System.out.println("Tip Recommended: " + tip);
				
				//System.out.println("Recommended Tip: " + recommendedTip);
			}
		    private static double getTip(double tabAmt, String serviceQuality) {
		    	double tipCalc=0;
		    	
		    	System.out.println("Tip Recommender");
		    	System.out.println("Tab: " + tabAmt);
		    	System.out.println("Service Quality: " + serviceQuality);
		    	if (serviceQuality =="Poor") {
		    		tipCalc = tabAmt * .16;
		    	}
		    	else if (serviceQuality =="Good") {
		    		tipCalc = tabAmt * .22; 
		    	}
		    	else if (serviceQuality =="Great"){
		    			tipCalc = tabAmt * .26;
		    	}
		    	
		    		    	
		    	//Return tip value
		    	//System.out.println("Tip Recommended: " + tipCalc);
		    	
		    	return tipCalc;

	}

}
