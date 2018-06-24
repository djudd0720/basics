package javaClassWeek2;

public class RemoveSpacesCharArray {

	public static void main(String[] args) {
		// create a method to remove all white spaces from a char array Ex #2 4/23

		char[] input = {'G','o','o','d', ' ' , 'd', 'a', 'y'};
		String noSpaces = removeSpaces(input);
		System.out.println("The new array with no spaces: " + noSpaces);

	}
	public static String removeSpaces(char[] input){
		String newString = "";
		for(int i=0; i<input.length; i++) {
			if (input[i] != ' ') {
				newString += input[i];
			}
		}
		return newString;	
	}

}
