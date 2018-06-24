package addExercises;

import java.util.Scanner;

public class classroomRatios {
	public static void main(String[] args) {
		// student - teacher ratio = # of students / # of teachers
		//% of girls = # of girls / total students * 100
		// Define the variables
		
		
		int numberBoys = 11;
		
		int numberTeachers = 2;
		
		
		Scanner in = new Scanner(System.in);
		//Prompt the user for # of girls
		System.out.print("Enter Number of Girls: ");
		//in.next will take in a string
		int numberofGirls = in.nextInt();
        System.out.println("The number of girls: " + numberofGirls);
        //System.out.print("Enter Your Age: ");
        double sumofStudents = numberofGirls + numberBoys;
        double percentageofGirls = (numberofGirls/sumofStudents) * 100;
		double studentTeacherratio = sumofStudents/numberTeachers;
        
      
				
		// Perform calculations and Print the result
		
		System.out.println(numberofGirls/sumofStudents);
		System.out.println(percentageofGirls + "% of the class are girls");
		System.out.println("The Student-Teacher ratio is " + studentTeacherratio);

	}
}
