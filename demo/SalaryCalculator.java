package demo;

public class SalaryCalculator {

	public static void main(String[] args) {
		// annual salary: hourly rate * hours in week * weeks in year minus vacation weeks
		
		// Define the variables
		double hourlyRate = 37;
		int hoursInWeek = 40;
		int vacationWeeks = 3;
		int weeksInYear = 52;
		
		// Perform calculations
		int workingWeeks = weeksInYear - vacationWeeks;
		double annualIncome = hourlyRate * hoursInWeek * workingWeeks;
		
		// Print the result
		System.out.println("$" + annualIncome);

	}

}
