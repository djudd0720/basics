package addExercises;

import java.util.Scanner;

public class WeekDayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputnum = new Scanner(System.in);
		System.out.print("What is the number day of the week: ");
		int numDayofweek =  inputnum.nextInt();
		if (numDayofweek > 7) {
		   System.out.println("Invalid Input");
	    }   
		else if (numDayofweek == 7) {
			System.out.println("Result : Saturday");
		}
		else if (numDayofweek == 6 ) {
			System.out.println("Result : Friday");
		}
		else if (numDayofweek == 5 ) {
			System.out.println("Result : Thursday");
		}
		else if (numDayofweek == 4 ) {
			System.out.println("Result : Wednesday");
		}
		else if (numDayofweek == 3) {
			System.out.println("Result: Tuesday");
		}
		else if (numDayofweek == 2) {
			System.out.println("Result: Monday");
		}
		else if (numDayofweek == 1) {
			System.out.println("Result: Sunday");
		}
		else {
			System.out.println("Number cannot be less than 1");
		}
	}

}
