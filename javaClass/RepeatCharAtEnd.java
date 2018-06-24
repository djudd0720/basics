package javaClass;

public class RepeatCharAtEnd {

	public static void main(String[] args) {
		// Move duplicate characters to the end

	System.out.println(moveWord("morning"));	
		
	}
	
	public static String moveWord(String word) {
		String nonDup = "";
		String dup = "";
		for (int i=0; i<word.length(); i++) {
			if(isMoreThanOneInWord(word, word.charAt(i))) {
				dup += word.charAt(i);
				
			}
			else {
				nonDup += word.charAt(i);
				
			}
		}
		return nonDup+dup;
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

}
