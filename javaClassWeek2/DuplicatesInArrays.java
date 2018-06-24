package javaClassWeek2;

public class DuplicatesInArrays {

	public static void main(String[] args) {
		// 

		// create a method to find duplicate characters in a char array Ex #3 4/23

				char[] input = {'G','o','o','d', ' ' , 'd', 'a', 'y',' ', 'D', 'e', 'n','i','s','e'};
				int dupcount = findDuplicates(input);
				System.out.println("There were " + dupcount + " duplicate letters.");

			}
			public static int findDuplicates(char[] input){
				int count = 0;
				for(int i=0; i<input.length; i++) {
					char letter = input[i];
					if (input[i] == input[i+1]) {
						count++;
					}
				}
				return count;	
			}

}


/*
public static void main(String[] args) {
	// TODO Auto-generated method stub

	String word = "Lamar";
	//char letter = 'a';
	System.out.println(removeDup(word));
}

public static String removeDup(String word) {
	String result = "";
	for (int i=0; i< word.length(); i++) {
		// ! false = true
		// ! true = false
		if(!isMoreThanOneInWord(word, word.charAt(i))) {
			result=result + word.charAt(i);
			
		}
	}
	return result;
}


public static boolean isMoreThanOneInWord(String word, char letter) {
	word=word.toLowerCase();
	letter = Character.toLowerCase(letter);
	int count = 0;
	for(int i=0; i<word.length(); i++) {
		if (word.charAt(i)==letter) {
			count++;
		}
		
		
	}
	return count>1;  //will return true or false
}
*/