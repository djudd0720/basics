package javaClassWeek2;

public class SumOfArrays {

	public static void main(String[] args) {
		// Calculate the sum of an Array
		
		int[]calSum = {1,2,3,4,5};
		int sum=calSum(calSum);
		System.out.println(sum);
	}
	public static int calSum(int[] numberArray) {
		int sum=0;
		for(int i=0; i<numberArray.length; i++) {
			sum += numberArray[i];
		}
		return sum;
	}
	 	
}
