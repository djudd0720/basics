/**
 * 
 */
/**
 * @author DJudd
 * 4/2/2018
 */

package basics;

import java.util.Scanner;

public class Inputfromuser {

	public static void main(String[] args) {
		//
		
		Scanner in = new Scanner(System.in);

		//Prompt the user for name and age

		System.out.print("Enter Your Name: ");

		//in.next will take in a string

		String name = in.next();

        System.out.println("Hi " + name);
        System.out.print("Enter Your Age: ");

        //in.nextInt will take in an integer

        int age = in.nextInt();
        System.out.print("Your age is: " + age);
	}

}
