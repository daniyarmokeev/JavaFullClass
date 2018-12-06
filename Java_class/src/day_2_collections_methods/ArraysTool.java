package day_2_collections_methods;

import java.util.Arrays;

public class ArraysTool {

	public static void main(String[] args) {
		
		int [] nums = {34,32,56,43,12,3};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] names = {"Elize", "John", "Adam"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		
		System.out.println(Arrays.binarySearch(nums, 12));
		
	}

}
