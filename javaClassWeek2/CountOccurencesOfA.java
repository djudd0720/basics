package javaClassWeek2;

public class CountOccurencesOfA {

	public static void main(String[] args) {
		// Count the number of occurrences of the letter 'a' in a char array
		//Exercise 1 on sheet
		
		char[] input = {'l','a','m','a','r'};
		int totalA = countA(input);
		System.out.println("There are a total of " + totalA + " a's.");

	}
	public static int countA(char[] input){
		int count = 0;
		for(int i=0; i<input.length; i++) {
			if (input[i] == 'a') {
				count++;
			}
		}
		return count;	
	}

}
