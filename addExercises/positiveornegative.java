package addExercises;

public class positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //determine if number is positive or negative
		int inputNumber = -7;
		
	
        System.out.println("INPUT: " + inputNumber);
	
	    //determine if num is pos or neg
	    if (inputNumber < 0) {
	    	System.out.println("RESULT: Negative");
	    }
	    else if (inputNumber > 0) {
	    	System.out.println("RESULT: Positive");
	    }
	    else {
	    	System.out.println("RESULT: Zero");
	    }
	}
}
