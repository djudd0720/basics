package javaClassWeek2;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// write a program to find the sum of an array.
		
		int[] arr= {16, 3, 4};
		int[] arr2 = {34, 26, 33};
		int sum = 0;
		
		for (int i=0;i<arr.length; i++) {
			sum = sum + arr[i];
			
		}
		int avg = sum/arr.length;
		System.out.println("Sum of array = "+ sum);
		System.out.println("Average of this array: " + avg);
		
		averageOf100();
		maxNumOfArray();
	
	}
	
	public static void averageOf100() {
		//	write a program to read one hundred numbers, compute their average,
		//and find out how many numbers are above the average
		
		int sum=0;
		int avg=0;
		
		for (int i=1; i<101; i++) {
			sum = sum+i;
			
		
		}
		avg = sum/101;
		System.out.println("the sum of number 1-100: " + sum);
		System.out.println("the average of these 100 numbers is: "+ avg);
	}
	
	public static void maxNumOfArray() {
	    
	        int n, max;

	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter number of elements in the array:");

	        n = s.nextInt();

	        int a[] = new int[n];

	        System.out.println("Enter elements of array:");

	        for(int i = 0; i < n; i++)

	        {

	            a[i] = s.nextInt();

	        }

	        max = a[0];

	        for(int i = 0; i < n; i++)

	        {

	            if(max < a[i])

	            {

	                max = a[i];

	            }

	        }

	        System.out.println("Maximum value:"+max);

	    }

	}


