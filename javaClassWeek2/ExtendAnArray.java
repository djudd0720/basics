package javaClassWeek2;

import java.util.Scanner;

public class ExtendAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//get user input
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your name");
	
	String[] source = { "Today", "is", "Monday"};
	String name = input.next();
		
	source = extendingArray(source, name);	
	for(int i=0; i<source.length; i++) {
		System.out.print(source[i]+ " ");
		}
	}
	//call function to extend array
	// sourceArray = [ "Today", "is", "Monday"] 
	// add user input "name" 
	
	public static String[] extendingArray(String[] sourceArray, String input) {
		
		String[] targetArray = new String[sourceArray.length+1];
		// targetArray => [null, null, null, null]
		String fullArray = "";
		for(int i=0; i<sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
			fullArray += fullArray + targetArray[i];
			
		}
		//targetArray => ["Today", "is", "Monday", null]  **store user input in last index
		
		targetArray[targetArray.length-1] = input;
		fullArray = fullArray + input;
		return targetArray;
	}

}
