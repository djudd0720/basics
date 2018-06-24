package javaClass;

public class CharacterRemove {

	public static void main(String[] args) {
		// 1. Write a method to remove a given character from a string. 
		//E.g. remove all 'a' from Averange should return vernge

		//call function
		String charinput = "Averange";
		String charinputlc = charinput.toLowerCase();
		char delchar = 'a';
		System.out.println("The new string is " + removeGiven(charinputlc, delchar));
		
	}
	//END OF MAIN
	
	public static String removeGiven(String input, char delchar) {
		String newword="";
		for (int i=0;i<input.length(); i++) {
			if (input.charAt(i)!= delchar) {
				newword = newword + input.charAt(i);
			}
		}
		return newword;
	}
}
//END OF PROGRAM
