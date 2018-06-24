package javaClass;

public class SquirrelPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//if temp is between 60 and 90 (inclusive) unless it is summer and then upper limit is 100
		
	if (SquirrelPlay(95,true)) {
		System.out.println("Squirrels are playing today!");
	}
	else System.out.println("Squirrels are NOT having fun today.");
		
		
	}
    //END OF MAIN
	
	public static boolean SquirrelPlay(int temp, boolean isSummer) {
		if (isSummer==true) {
			if (temp <= 100) {
				return true;
			}
			else return false;
		}

		else if (temp>=60 && temp <= 90)  {
			return true;
				
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
}
//END OF PROGRAM