/**
 * 
 */
/**
 * @author DJudd
 * 4/2/2018
 */

package basics;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //call the function sayHi
		sayHi();
		
		//call the function printName
		printName("Tim", "Stephens");
		
		//call the combineName function
		String fullname = combineName("Tim", "Stephens");
		System.out.println(fullname);
	}
	public static void sayHi(){
		System.out.println("Hi!");
	}
	public static void printName(String firstname, String lastname) {
	    System.out.println("First name: " + firstname);
	    System.out.println("Lastname: " + lastname);
	}
	public static String combineName(String firstname, String lastname) {
		String combineName = firstname + " " + lastname;
		return combineName;
	}
}
