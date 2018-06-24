package javaClass;

public class GreenLotteryTicket {

	public static void main(String[] args) {
		// You have a green lottery ticket with 3 integers on it. If all nums are different you get 0
		// if 2 nums match, you get 10 and if 3 nums match you get 20
		
		int numOfPoints = numberofMatches(1,2,2);
		System.out.println("Your points are: " + numOfPoints);
		

		
	}
    //END OF MAIN
	
	public static int numberofMatches(int a, int b, int c) {
	//int points = 0;	
		//for (i=0, i<4, i++) {
			if (a==b) {
				if (a==c) {
					return 30;
				}
				else return 20;
			}
			else if (a==c || b==c) {
				return 20;
			}
			else return 0;
		//}
		
		
	}
	
	
	
	
}
//END OF PROGRAM