package addExercises;

import java.util.Scanner;

public class numberictoletterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //convert a numeric grade to a letter grade
		
		Scanner inputnum = new Scanner(System.in);
		System.out.print("What is the number grade: ");
		int numGrade =  inputnum.nextInt();
		if (numGrade > 110) {
		   System.out.println("Invalid Input");
	    }   
		else if (numGrade > 89) {
			System.out.println("Result : A");
		}
		else if (numGrade > 79 ) {
			System.out.println("Result : B");
		}
		else if (numGrade > 71 ) {
			System.out.println("Result : C");
		}
		else if (numGrade > 63 ) {
			System.out.println("Result : D");
		}
		else if (numGrade < 64) {
			System.out.println("Result: F");
		}
	}
		

}
