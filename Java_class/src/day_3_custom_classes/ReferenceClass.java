package day_3_custom_classes;

import java.util.Arrays;

public class ReferenceClass {

	public static void main(String[] args) {
		
		int myIntvalue = 20;
		int anotherIntValue = myIntvalue;
		
		System.out.println(myIntvalue);
		System.out.println(anotherIntValue);
		
		anotherIntValue = anotherIntValue +myIntvalue;
		
		System.out.println(myIntvalue);
		System.out.println(anotherIntValue);

		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray;
		
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
		
		anotherArray[0]=1;
		
		System.out.println(Arrays.toString(myIntArray));
		System.out.println(Arrays.toString(anotherArray));
	}

}
