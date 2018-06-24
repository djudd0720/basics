package addExercises;

public class TipRecommender {

	public static void main(String[] args) {
		// define variables
		
		
				double tabAmt = 33.57;
				String serviceQuality = "Great";
				
				
				
				
				// Call the futureValue function
				getTip(tabAmt, serviceQuality);
				//double tip = recommendedTip;
				
				//System.out.println("Recommended Tip: " + recommendedTip);
			}
		    private static void getTip(double tabAmt, String serviceQuality) {
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
		    	System.out.println("Tip Recommended: " + tipCalc);
		    	
		    	//return double recommendedTip;

	}

}
