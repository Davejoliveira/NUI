// Project goal: Receive user input (type double) to set array size, display values and sum of the values.

import java.util.Scanner;
public class ArrayValues {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the desired Array size: \n");
		double sum=0;
		int size=scanner.nextInt();
		double array[]=new double[size];
		
		System.out.println("Enter Array values: ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();	
		}
	
		// Loop to display all array values added by user input
		System.out.println("Array values: ");
		for(double arrayElement :array) {
			System.out.println(arrayElement + " ");
		}
			
		// Loop to display the sum of array values
		for (int i = 0; i < array.length; i++) {
			sum=sum+array[i];
		}
		
		System.out.println("Total sum is: " + sum);
	}
}
