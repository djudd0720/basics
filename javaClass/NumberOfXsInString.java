package javaClass;

public class NumberOfXsInString {

	public static void main(String[] args) {
		// Count the number of x's in a string (including overlapping x's
		
		
		int total = countXX("xxcxx");
		System.out.println("The total xx's is " + total);

	}
    //END OF MAIN
	public static int countXX(String substring) {
	
	int count = 0;
	char someChar = 'x';
	for (int i=0;(i<substring.length()-1); i++) {
		System.out.println("i is : " + i);
		if (substring.charAt(i)== someChar) {
			
				if (substring.charAt(i+1) == someChar) {
					count++;
					System.out.println("count is : " + count);
				}
			
		}
		
	}
		
		
	return count;	
	}
	
	
	
	
	
	
}
//END OF PROGRAM