package javaClassWeek2;

public class StringArrayBackwards {

	public static void main(String[] args) {
		// write a method to display the words in reverse order (in a new array backwards) - How Are You => You Are How

		String[] myArray = {"How", "Are", "You"};
		String[] newString;
		newString = reverseStringArray(myArray);
		
		for (int i=0; i<newString.length; i++){
				System.out.println(newString[i]);
		}
		
	}
	public static String[] reverseStringArray(String[] myArray) {
		
		String [] newString = new String [myArray.length];
		int j = 0;
		
		
		for (int i=myArray.length-1; i>=0; i--) {
			
			
				newString[j] = myArray[i];
				j++;
			
		}
		
		return newString;
	}

}
//
