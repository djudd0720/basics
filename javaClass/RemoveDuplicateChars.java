package javaClass;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// remove duplicate characters from a string

		
		//call function 
		String input="Namaste";
		String newword = removeDups(input);
		System.out.println("The new word is: " + newword);
	}
	//end of main
	
	
	public static String removeDups(String input) {
		String newword = "";
		boolean duplicate=false;
		
		
			for (int i=0; i<input.length(); i++) {
				duplicate=false;	
				//	newword=newword+ input.charAt(i);
					System.out.println("First for loop. i = " + i);
					char ltrtocheck = input.charAt(i);
					
					for (int j=0; j<input.length(); j++) {
						System.out.println("Second for loop. next = " + j);
						char nextltr=input.charAt(j);
			
						if (ltrtocheck ==nextltr && i!=j){
							System.out.println("In if statement");
							duplicate=true;
							//j=input.length();
						}
					
						
					}
					if (!duplicate) {
						newword = newword + input.charAt(i);}
					
			}		
				
		
		
		return newword;	
			
	}
	
	
	
}
//end of program
