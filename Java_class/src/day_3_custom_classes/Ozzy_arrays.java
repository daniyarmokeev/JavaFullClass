package day_3_custom_classes;

import java.util.Arrays;
import java.util.Scanner;

public class Ozzy_arrays {

	public static void main(String[] args) {
		int[] myIntArray = new int[10];
		myIntArray[0]=35;
		myIntArray[1]=23;
		System.out.println(Arrays.toString(myIntArray));
		
		int [] myIntArray2 = {1,2,3,4,5};
		System.out.println(Arrays.toString(myIntArray2));
		
		int[] myIntegers = getIntegers(3);
		System.out.println(Arrays.toString(myIntegers));
		System.out.println("the average is :" + getAverage(myIntegers));
		
	}
	//create a method
	public static int[] getIntegers(int number) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter " + number + " integer values");
		int[] values = new int[number];
		
		for(int i=0; i<values.length;i++) {
			values[i] = scan.nextInt();
		}
		return values;
	}
	public static double getAverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum/array.length;
		
		
		
	}

}
