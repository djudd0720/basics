package demo;

public class WelcomeMessage {
   public static void main(String[] args) {
	   System.out.println("Test message");
	   
	   //Declaring the variable
	   String name;
	   
	   //Define the variable
	   name="Shawn";
			   
	   //Declare and Define variable
	   String date = "Friday, 2:12pm";
	   double transactionAmount = 32.58;
	   char sign = '+';
	 
	   
	   System.out.println(name);
	   System.out.println(date);
	   System.out.println(transactionAmount);
	   System.out.println("Hi " + name + ", welcome back! Your last login was " + date + ". Your last transaction was for " + sign +" $" + transactionAmount + ".");
   }
}
