package day_2_collections_methods;
import java.util.Arrays;
import java.util.Scanner;
public class myArrays {

	public static void main(String[] args) {
	
//		int [] ages = new int[5];
//		ages[0]=23;
//		System.out.println(ages[0]);
//		
//		//Initialization of arrays
//		
//		int [] ages2 = {34,34,32,56,3,3};
//		System.out.println(ages2[2]);
//		System.out.println(ages2.length);

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of ages");
		
		int [] ages = new int[scan.nextInt()];
	
		int k = 1;
		
		for(int i = 0; i< ages.length;i++) {
			System.out.println("Please enter age" + k++);
			ages[i] = scan.nextInt();
			
		}
		System.out.println("size" + ages.length);
		
		for(int age: ages) {
			System.out.println(age);
		}
		
		System.out.println(Arrays.toString(ages));
	}

}
