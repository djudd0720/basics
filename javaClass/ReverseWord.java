package javaClass;

public class ReverseWord {

	public static void main(String[] args) {
		// Reverse word and print

		//call function
		reverse("Java");
		System.out.println("The Reverse is " + reverse("Java"));
	}
	//END OF MAIN
	public static String reverse(String input) {
		//int len=input.length();
		
		String result = "";
		
		//String result = null;
		//or String result = new String();
		for (int i=0; i<input.length(); i++) {
			result = input.charAt(i)+ result; //by adding existing result last, it puts it in reverse
		}
		return result;
	}
}
