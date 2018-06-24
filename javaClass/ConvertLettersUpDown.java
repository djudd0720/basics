package javaClass;

public class ConvertLettersUpDown {

	public static void main(String[] args) {
		/*Write a program to convert every even position to upper case and every 
		 * odd position to lower case.  eg input "Banana" output :"bAnAnA" 
		 * or input "StLouis" output:"sTlOuIs"
		 */
		
		String word="Banana";
		System.out.println(convertCase(word));	

	}
	//end of main
	public static String convertCase(String word) {
		String result = "";
		word = word.toLowerCase();
		
		for (int i=0; i<word.length(); i++) {
			String temp = String.valueOf(word.charAt(i)); //this value of changes it to a string
			//Or you can do it this way - String temp = word.charAt(i) + ""; (concatination automatically makes it a string)
			if(i%2!=0) {
				temp=temp.toUpperCase();
			
			}
			result +=temp;
			
		}
	
	return result;
	}
	//end of function
}
//end of program