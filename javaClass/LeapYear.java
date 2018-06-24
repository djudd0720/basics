package javaClass;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean leapyear;
		int year = 2022;
		if (isLeapYear(year)) {
			System.out.println(year + " is a Leap Year");
		
		}
		else System.out.println(year + " is NOT a Leap Year");
		}
	//END OF MAIN
	
	public static boolean isLeapYear(int year) {
		/*
		 * To determine whether a year is a leap year, follow these steps:

    	How leap year is calculated?
		Steps

    	Start off using the year you want to calculate.
    	See if it is evenly divisible by 4 (a whole number with no remainder). If it is not, like 1997, it is not a leap year. ...
    	See if the year is divisible by 100. If a year is divisible by 4, but not 100, like 2012, it is a leap year. ...
    	See if the year is divisible by 400
		 */
		
		if (year%4==0) {
			return true;
		}if (year%100 ==0) {
			return true;
			
		}if (year%400 ==0) {
			return true;
		}return false;
				
	}
}
//END OF PROGRAM