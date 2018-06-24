package addExercises;

public class marathonRacetime {
	public static void main(String[] args) {
		/* In 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal in the men’s
		26.2-mile marathon race. The official timer tracked his race at 7724 seconds. What
		is his time in hours, minutes, and seconds?
		RESULT: 2hrs:8mins:44secs
		Bonus: What was his average pace per mile in minutes?
		RESULT: Average pace: 4.885 minutes per mile*/
		// Define the variables
		
		double totalmiles = 26.2;
		int marathontotalsecs = 7724;
		int marathontotalminutes = marathontotalsecs/60;
		int marathontotalhours = marathontotalminutes/60;
		int hoursruninminutes = marathontotalhours*60;
		int hoursruninseconds = hoursruninminutes*60;
		int minutesrunafterhoursdeducted = marathontotalminutes - hoursruninminutes;
		int leftoverminutesinsecs = minutesrunafterhoursdeducted * 60;
		
		int totalminutes = marathontotalsecs/ 60;
		int secondsleftover = marathontotalsecs - hoursruninseconds - leftoverminutesinsecs;
		double avgpace = totalminutes/totalmiles;
		//int leftoverminutes = marathontotalsecs - (3600*totalhours) *60;		
				
		// Perform calculations and Print the result
		System.out.println("Marathon in minutes: " + marathontotalminutes);
		System.out.println("Total hours: " + marathontotalhours);
		System.out.println("RESULT:  " + marathontotalhours + "hours:" + minutesrunafterhoursdeducted + "mins:" + secondsleftover + "secs");
		System.out.println("Average pace: " + avgpace + " minutes per mile");

	}
}
