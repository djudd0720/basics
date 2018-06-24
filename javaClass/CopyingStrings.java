package javaClass;

public class CopyingStrings {

	public static void main(String[] args) {
		// Copy string n number of times
		
	String result = copyString("Hi", 5);
	System.out.println(result);
		

	}
    //END OF MAIN
	
	public static String copyString(String str, int numoftimes) {
	
		String in = str;
	
		int n = numoftimes;
		String result = "";
	
		for (int i = 0; i < n; i += 1) {
			result += in;
		}
		return result;
	}
	
}
//END OF PROGRAM