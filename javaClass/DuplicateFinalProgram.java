package javaClass;

public class DuplicateFinalProgram {

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

}
