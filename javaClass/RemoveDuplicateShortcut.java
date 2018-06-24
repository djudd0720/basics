package javaClass;

public class RemoveDuplicateShortcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Namastaae";
		String newword=removeDuplicateCharactersFromWord(word);
		System.out.println("New word is: " + newword);
	}
	//end of main
	


	private static String removeDuplicateCharactersFromWord(String word) {

		String result = new String("");

		for (int i = 0; i < word.length(); i++) {
			if (!result.contains("" + word.charAt(i))) {
				result += "" + word.charAt(i);
			}
		}

		return result;
	}

	//Another possible idea below using arrays
/*
char[] chars = s.toCharArray();
    HashSet<Character> charz = new HashSet<Character>();

    for(Character c : s.toCharArray() )
    {
        if(!charz.contains(c))
        {
            charz.add(c);
            //System.out.print(c);
        }
    }

    for(Character c : charz)
    {
        System.out.print(c);
    }
*/



}
